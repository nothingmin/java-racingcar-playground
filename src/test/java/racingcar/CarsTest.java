package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {
    private Cars cars;
    private Car car1;

    @BeforeEach
    public void setup() {
        this.car1 = new Car("GWAK");
        Car car2 = new Car("BUM");
        Car car3 = new Car("GYU");

        this.cars = new Cars(Arrays.asList(car1, car2, car3));
    }

    @Test
    public void max_position() {
        car1.move();
        car1.move();
        assertThat(cars.maxPosition()).isEqualTo(car1.getPosition());
    }
}
