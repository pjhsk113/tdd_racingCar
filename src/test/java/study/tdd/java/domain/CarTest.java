package study.tdd.java.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = Car.from("a");
    }

    @DisplayName("자동차 전진 테스트")
    @Test
    void 값이_4이상일때만_1칸_전진한다() {
        MoveStrategy moveStrategy = new CarMoveStrategy();
        if (moveStrategy.moveAble()) {
            car.move(moveStrategy);
            assertThat(car.getPosition()).isOne();
        }
    }

    @DisplayName("자동차 전진 예외 테스트")
    @Test
    void 값이_4이하면_전진하지_않는다() {
        MoveStrategy moveStrategy = new TestMoveStrategy();
        car.move(moveStrategy);
        assertThat(car.getPosition()).isZero();
    }

    @DisplayName("자동차 이름이 5글자를 넘어가는 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"페페라라리리", "포르쉐쉑버거", "람보르기니기니"})
    void name_Length_Exception_Test(String input) {
        assertThatThrownBy(() -> {
            Car.from(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차 이름이 공백일 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {" ", "", "   "})
    void name_Empty_Exception_Test(String input) {
        assertThatThrownBy(() -> {
            Car.from(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차 이름이 Null일 경우 예외 테스트")
    @Test
    void name_Null_Exception_Test() {
        assertThatThrownBy(() -> {
            Car.from(null);
        }).isInstanceOf(NullPointerException.class);
    }
}