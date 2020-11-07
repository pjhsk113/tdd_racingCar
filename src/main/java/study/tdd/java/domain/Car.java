package study.tdd.java.domain;

/**
 * Car 객체에서는 각 자동차의 이동 전략과
 * 이름에 대한 책임을 가진다.
 */
public class Car {
    private static final String NAME_LENGTH_EXCEPTION_MESSAGE = "이름은 5자를 초과할 수 없습니다.";
    private static final String NAME_EMPTY_EXCEPTION_MESSAGE = "공백은 입력할 수 없습니다.";
    private static final String NAME_NULL_EXCEPTION_MESSAGE = "Null은 입력할 수 없습니다";
    private static final int NAME_LENGTH_LIMIT = 5;

    private int position;
    private final String name;

    private Car(String name) {
        validate(name);
        this.name = name;
    }

    public static Car from(String name) {
        return new Car(name);
    }

    public void move(MoveStrategy moveAble) {
        if (moveAble.moveAble()) {
            position++;
        }
    }

    private void validate(String name) {
        checkNameLength(name);
        isEmpty(name);
        isNull(name);
    }

    private void checkNameLength(String name) {
        if (name.length() > NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(NAME_LENGTH_EXCEPTION_MESSAGE);
        }
    }
    private void isEmpty(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(NAME_EMPTY_EXCEPTION_MESSAGE);
        }
    }
    private void isNull(String name) {
        if (name == null) {
            throw new NullPointerException(NAME_NULL_EXCEPTION_MESSAGE);
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
