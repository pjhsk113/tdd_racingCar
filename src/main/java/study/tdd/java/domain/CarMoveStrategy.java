package study.tdd.java.domain;

import java.util.Random;

public class CarMoveStrategy implements MoveStrategy{
    private static final int RANDOM_VALUE_BOUND_NUMBER = 9;
    private static final int POSSIBLE_MOVE_VALUE = 4;

    @Override
    public boolean moveAble() {
        return new Random()
                .nextInt(RANDOM_VALUE_BOUND_NUMBER) >= POSSIBLE_MOVE_VALUE;
    }
}
