package study.tdd.java.utils;

public class StringUtils {
    private static final String COMMA = ",";

    private StringUtils() { }

    public static String[] splitName(String names) {
        return names.split(COMMA);
    }
}
