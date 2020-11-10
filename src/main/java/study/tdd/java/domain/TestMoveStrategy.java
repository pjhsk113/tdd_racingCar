package study.tdd.java.domain;

public class TestMoveStrategy implements MoveStrategy{
    private int number;

    @Override
    public boolean moveAble() {
        boolean isBiggerThanFour = moveNumber(number);
        if (isBiggerThanFour) {
            return true;
        }
        return false;
    }

    public boolean moveNumber(int number) {
        this.number = number;
        return number >= 4;
    }
}
