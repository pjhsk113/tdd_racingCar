package study.tdd.java.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @DisplayName("Cars 생성 테스트")
    @ParameterizedTest
    @CsvSource(value = {
            "a,b,c : 3",
            "hello,world : 2",
            "c : 1"}, delimiter = ':')
    void init_Test(String names, int carSize) {
        Cars cars = Cars.of(names.split(","));
        assertThat(cars.stream().count()).isEqualTo(carSize);
    }
}