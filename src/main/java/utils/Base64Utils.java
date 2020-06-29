package utils;

import java.util.Base64;

public class Base64Utils {
    public static String decode(String input) {
        return new String(Base64.getDecoder().decode(input));
    }

    public static String encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }
}
