package lab2;

public class ParserUtils {
    public static String[] getPart (String str) {
        String[] part = str.split(",[\"]");
        for(int i = 0; i < part.length; i++) {
            part[i] = part[i].replaceAll("\"", "");
        }
        return part;
    }
}
