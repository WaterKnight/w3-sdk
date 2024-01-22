package w3.script.jass.extensible_jass;

import w3.script.jass.extensible_jass.specific.Program;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AntlrGrammarGenerator {
    public static void main(String[] args) {
        final var program = new Program();
        new SelectExtension().register(program);
        new AntlrGrammarGenerator().generate(program, new JassTerminal("WS") {
            @Override
            public LexerValue getLexerValue(ParseContext ctx) {
                return new LexerValue("(' ' | '\\t')+").setSkipped(true);
            }
        });
    }

    public void generate(JassNode ...roots) {
        final PrintStream printStream = new PrintStream(System.out);

        final ParseContext ctx = new ParseContext();

        printStream.println("grammar j;");

        final Set<String> resolvedNodes = new HashSet<>();
        final Set<String> started = new HashSet<>();
        final List<ParserRule> parserRules = new ArrayList<>();
        final List<LexerRule> lexerRules = new ArrayList<>();

        for (final JassNode root : roots) {
            walk(printStream, root, ctx, resolvedNodes, started, parserRules, lexerRules);
        }

        lexerRules.sort((a, b) -> {
            if (a.terminal.getLexerValue(ctx) instanceof Keyword) {
                if (b.terminal.getLexerValue(ctx) instanceof Keyword) {
                    return a.name.compareTo(b.name);
                }
                return -1;
            }
            if (b.terminal.getLexerValue(ctx) instanceof Keyword) {
                if (a.terminal.getLexerValue(ctx) instanceof Keyword) {
                    return b.name.compareTo(a.name);
                }
                return 1;
            }
            return 0;
        });

        lexerRules.forEach(lexerRule -> {
            printStream.println(String.format("%s: %s%s;", lexerRule.name, lexerRule.value, lexerRule.terminal.getLexerValue(ctx).isSkipped() ? " -> skip" : ""));
        });

        parserRules.forEach(parserRule -> {
            printStream.println(String.format("%s: %s;", parserRule.name, parserRule.value));
        });
    }

    private void walk(PrintStream printStream, JassNode node, ParseContext ctx, Set<String> resolvedNodes, Set<String> started, List<ParserRule> parserRules, List<LexerRule> lexerRules) {
        if (resolvedNodes.contains(node.getName())) {
            return;
        }

        if (node instanceof OptionalQuantifier) {
            walk(printStream, ((OptionalQuantifier) node).getContent(ctx), ctx, resolvedNodes, started, parserRules, lexerRules);
        } else if (node instanceof StarQuantifier) {
            walk(printStream, ((StarQuantifier) node).getContent(ctx), ctx, resolvedNodes, started, parserRules, lexerRules);
        } else if (node instanceof PlusQuantifier) {
            walk(printStream, ((PlusQuantifier) node).getContent(ctx), ctx, resolvedNodes, started, parserRules, lexerRules);
        } else if (node instanceof Alternative) {
            ((Alternative) node).getChildren().forEach(child -> {
                walk(printStream, child, ctx, resolvedNodes, started, parserRules, lexerRules);
            });
        } else if (node instanceof Sequence) {
            ((Sequence) node).getChildren().forEach(child -> {
                walk(printStream, child, ctx, resolvedNodes, started, parserRules, lexerRules);
            });
        } else if (node instanceof JassNonTerminal) {
            resolvedNodes.add(node.getName());
            walk(printStream, ((JassNonTerminal) node).getContent(ctx), ctx, resolvedNodes, started, parserRules, lexerRules);
            parserRules.add(new ParserRule(node.getName(), toValueString(node, ctx, started, 0)));
        } else if (node instanceof JassTerminal) {
            resolvedNodes.add(node.getName());
            lexerRules.add(new LexerRule(node.getName(), (JassTerminal) node, toValueString(node, ctx, started, 0)));
        }
    }

    private static class ParserRule {
        private final String name;
        private final String value;

        public ParserRule(String name, String value) {
            this.name = name;
            this.value = value;
        }
    }

    private static class LexerRule {
        private final String name;
        private final JassTerminal terminal;
        private final String value;

        public LexerRule(String name, JassTerminal terminal, String value) {
            this.name = name;
            this.terminal = terminal;
            this.value = value;
        }
    }

    /*private String nodeToString(JassNode node, ParseContext ctx) {
        if (node instanceof JassTerminal) {
            return String.format("'%s'", ((JassTerminal) node).getRegex(ctx));
        }
        if (node instanceof Sequence) {
            return ((Sequence) node).getChildren().stream().map(JassNode::getName).collect(Collectors.joining(" | "));
        }
        if (node instanceof Alternative) {
            return ((Alternative) node).getChildren().stream().map(JassNode::getName).collect(Collectors.joining(" | "));
        }
        if (node instanceof OptionalQuantifier) {
            return String.format("%s?", ((OptionalQuantifier) node).getChildren(ctx).stream().map(JassNode::getName).collect(Collectors.joining(" ")));
        }
        if (node instanceof StarQuantifier) {
            return String.format("%s*", ((StarQuantifier) node).getChildren(ctx).stream().map(JassNode::getName).collect(Collectors.joining(" ")));
        }
        if (node instanceof PlusQuantifier) {
            return String.format("%s+", ((PlusQuantifier) node).getChildren(ctx).stream().map(JassNode::getName).collect(Collectors.joining(" ")));
        }
        if (node instanceof JassNonTerminal) {
            return String.format("(%s)", ((JassNonTerminal) node).getChildren(ctx).stream().map(child -> {
                if (child instanceof Sequence) {
                    return String.format("(%s)", nodeToString(child, ctx));
                }
                if (child instanceof Alternative) {
                    return String.format("(%s)", nodeToString(child, ctx));
                }
                if (child instanceof OptionalQuantifier) {
                    return String.format("%s", nodeToString(child, ctx));
                }
                if (child instanceof StarQuantifier) {
                    return String.format("%s", nodeToString(child, ctx));
                }
                if (child instanceof PlusQuantifier) {
                    return String.format("%s", nodeToString(child, ctx));
                }
                return child.getName();
            }).collect(Collectors.joining(" ")));
        }
        return null;
    }*/

    private String toValueString(JassNode node, ParseContext ctx, Set<String> started, int depth) {
        if (node instanceof Sequence) {
            final String childrenString = ((Sequence) node).getChildren().stream().map(child -> toValueString(child, ctx, started, depth + 1)).collect(Collectors.joining(" "));
            if (depth < 2) {
                return childrenString;
            }
            return "(" + childrenString + ")";
        }
        if (node instanceof Alternative) {
            final String childrenString = ((Alternative) node).getChildren().stream().map(child -> toValueString(child, ctx, started, depth + 1)).collect(Collectors.joining(" | "));
            if (depth < 2) {
                return childrenString;
            }
            return "(" + childrenString + ")";
        }
        if (node instanceof OptionalQuantifier) {
            return String.format("%s?", toValueString(((OptionalQuantifier) node).getContent(), ctx, started, depth + 1));
        }
        if (node instanceof StarQuantifier) {
            return String.format("%s*", toValueString(((StarQuantifier) node).getContent(), ctx, started, depth + 1));
        }
        if (node instanceof PlusQuantifier) {
            return String.format("%s+", toValueString(((PlusQuantifier) node).getContent(), ctx, started, depth + 1));
        }
        if (node instanceof JassNonTerminal) {
            if (!started.contains(node.getName()) && depth == 0) {
                started.add(node.getName());
                return toValueString(((JassNonTerminal) node).getContent(ctx), ctx, started, depth + 1);
            } else {
                return node.getName();
            }
        }
        if (node instanceof JassTerminal) {
            if (depth == 0) {
                return String.format("%s", ((JassTerminal) node).getLexerValue(ctx).getValue());
            } else {
                return node.getName();
            }
        }
        return null;
    }

    private String terminalToValueString(JassTerminal node, ParseContext ctx) {
        return String.format("%s", node.getLexerValue(ctx).getValue());
    }
}
