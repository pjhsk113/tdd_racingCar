package study.tdd.java.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void createCars(String[] carNames) {
        cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(Car.from(name));
        }
    }

    public Stream<Car> stream() {
        return cars.stream();
    }
}
