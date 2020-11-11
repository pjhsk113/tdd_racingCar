package study.tdd.java.exception;

public class CarExceptionHandler {
    private static final String NAME_LENGTH_EXCEPTION_MESSAGE = "이름은 5자를 초과할 수 없습니다.";
    private static final String NAME_EMPTY_EXCEPTION_MESSAGE = "공백은 입력할 수 없습니다.";
    private static final String NAME_NULL_EXCEPTION_MESSAGE = "Null은 입력할 수 없습니다";
    private static final int NAME_LENGTH_LIMIT = 5;

    private CarExceptionHandler() { }

    public static void validate(String name) {
        checkNameLength(name);
        isEmpty(name);
        isNull(name);
    }

    private static void checkNameLength(String name) {
        if (name.length() > NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(NAME_LENGTH_EXCEPTION_MESSAGE);
        }
    }
    private static void isEmpty(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(NAME_EMPTY_EXCEPTION_MESSAGE);
        }
    }
    private static void isNull(String name) {
        if (name == null) {
            throw new NullPointerException(NAME_NULL_EXCEPTION_MESSAGE);
        }
    }
}
