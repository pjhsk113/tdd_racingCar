package study.tdd.java.domain;

import study.tdd.java.utils.MoveStrategy;

/**
 * Car 객체에서는 각 자동차의 이동 전략과
 * 이름에 대한 책임을 가진다.
 */
public class Car {
    private int position;
    private final String name;

    private Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
        }
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("공백은 입력할 수 없습니다.");
        }
        if (name == null) {
            throw new NullPointerException("Null은 입력할 수 없습니다");
        }
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

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
