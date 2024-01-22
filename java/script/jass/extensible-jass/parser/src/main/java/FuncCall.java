import java.util.ArrayList;
import java.util.List;

public class FuncCall extends Expr {
    private String funcName;
    private List<Argument> arguments = new ArrayList<>();

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }
}
