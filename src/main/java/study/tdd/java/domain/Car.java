package study.tdd.java.domain;

import study.tdd.java.exception.CarExceptionHandler;

/**
 * Car 객체에서는 각 자동차의 이동 전략과
 * 이름에 대한 책임을 가진다.
 */
public class Car {

    private int position;
    private final String name;

    private Car(String name) {
        CarExceptionHandler.validate(name);
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
