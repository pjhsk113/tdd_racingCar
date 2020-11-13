package study.tdd.java.domain;

public class TestMoveStrategy implements MoveStrategy{
    private int number;

    @Override
    public boolean moveAble() {
        return moveNumber(number);
    }

    public boolean moveNumber(int number) {
        this.number = number;
        return number >= 4;
    }
}
