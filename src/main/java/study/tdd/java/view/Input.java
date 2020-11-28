package study.tdd.java.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import static study.tdd.java.utils.StringUtils.splitName;

public class Input {
    private static final String INPUT_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String INVALID_INPUT_ROUND = "라운드는 숫자만 입력 가능합니다.";

    private static final Scanner scanner = new Scanner(System.in);

    private Input() { }

    public static String[] inputCarName() {
        System.out.println(INPUT_NAME_MESSAGE);
        return splitName(scanner.nextLine());
    }

    public static int inputRound() {
        try {
            System.out.println(INPUT_ROUND_MESSAGE);
            int round = scanner.nextInt();
            return round;

        } catch (InputMismatchException e) {
            throw new NumberFormatException(INVALID_INPUT_ROUND);
        }
    }
}
