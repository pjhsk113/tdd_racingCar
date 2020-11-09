package study.tdd.java.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Cars {
    private List<Car> cars;

    private Cars(String[] names) {
        createCars(names);
    }

    public static Cars of(String[] names) {
        return new Cars(names);
    }

    private void createCars(String[] carNames) {
        cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(Car.from(name));
        }
    }

    public Stream<Car> stream() {
        return cars.stream();
    }

    public void moveCars(CarMoveStrategy carMoveStrategy) {
//        for (Car car : cars) {
//            car.move(carMoveStrategy);
//        }
        cars.forEach(car -> car.move(carMoveStrategy));

    }
}
