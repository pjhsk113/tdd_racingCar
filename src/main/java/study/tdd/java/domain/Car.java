package study.tdd.java.domain;

/**
 * Car 객체에서는 각 자동차의 이동 전략과
 * 이름에 대한 책임을 가진다.
 */
public class Car {
    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
