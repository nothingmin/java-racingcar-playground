package racingcar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars =cars;
    }

    public int maxPosition() {
        return cars.stream().map(Car::getPosition).max(Integer::compare).orElse(-1);
    }
}
