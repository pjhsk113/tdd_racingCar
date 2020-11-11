package study.tdd.java.view;

import java.util.Scanner;

import static study.tdd.java.utils.StringUtils.splitName;

public class Input {
    private static final String INPUT_NAME_MESSAGE = "자동차 이름 입력";
    private static final String INPUT_ROUND_MESSAGE = "게임 횟수 입력";

    private static final Scanner scanner = new Scanner(System.in);

    public String[] inputCarName() {
        System.out.println(INPUT_NAME_MESSAGE);
        return splitName(scanner.nextLine());
    }

    public int inputRound() {
        System.out.println(INPUT_ROUND_MESSAGE);
        return scanner.nextInt();
    }


}
