package study.tdd.java.domain;

import study.tdd.java.view.Input;
import study.tdd.java.view.Result;

public class RacingGame {

    public void play() {
        String[] inputName = Input.inputCarName();
        int inputRound = Input.inputRound();

        Cars cars = Cars.of(inputName);
        CarMoveStrategy moveStrategy = new CarMoveStrategy();
        for (int i = 0; i < inputRound; i++) {
            cars.moveCars(moveStrategy);
            Result.printResult(cars);
        }

        Result.printWinner(cars.winnerIs(cars));
    }
}
