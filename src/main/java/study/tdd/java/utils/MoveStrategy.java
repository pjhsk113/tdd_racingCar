package study.tdd.java.utils;

import java.util.Random;

/**
 * 자동차의 전진 전략
 * 최대값이 9인 랜덤값을 생성하고, 그 값이 4 이상일 경우에만 전진한다.
 */
public class MoveStrategy {
    public boolean moveAble() {
        return new Random()
                .nextInt(9) >= 4;
    }
}
