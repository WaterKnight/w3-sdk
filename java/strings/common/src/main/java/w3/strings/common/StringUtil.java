package w3.strings.common;

public class StringUtil {
    public static String padLeft(String str, int length, char padCharacter) {
        return String.format("%1$" + length + "s", str).replace(' ', padCharacter);
    }
}
