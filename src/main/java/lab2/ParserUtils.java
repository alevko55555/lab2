package lab2;

import java.util.Optional;

public class ParserUtils {
    private static String[] part;

    ParserUtils(String str) {
        part = str.split(",[\"]");
        for(int i = 0; i < part.length; i++) {
            part[i] = part[i].replaceAll("\"", "");
        }
    }

    Optional<String> getString(int index) {
        return Optional.of(part[index]);
    }
}
