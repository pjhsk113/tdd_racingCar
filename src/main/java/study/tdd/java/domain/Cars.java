package study.tdd.java.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
        cars.forEach(car -> car.move(carMoveStrategy));
    }

    public List<Car> winnerIs (Cars winner) {
        return winner.stream()
                .filter(car -> car.getPosition() == maxPosition(winner))
                .collect(Collectors.toList());
    }

    private int maxPosition(Cars position) {
        return position.stream()
                .map(Car::getPosition)
                .reduce(0, Math::max);
    }
}
