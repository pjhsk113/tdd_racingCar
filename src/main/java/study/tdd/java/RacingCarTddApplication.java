package study.tdd.java;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import study.tdd.java.domain.RacingGame;

@SpringBootApplication
public class RacingCarTddApplication {

    public static void main(String[] args) {
        new RacingGame().play();
    }
}
