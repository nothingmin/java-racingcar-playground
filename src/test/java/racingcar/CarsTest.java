package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {
    @Test
    public void max_position() {
        Car car1 = new Car("GWAK");
        Car car2 = new Car("BUM");
        Car car3 = new Car("GYU");
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));
        car1.move();
        car1.move();
        assertThat(cars.maxPosition()).isEqualTo(car1.getPosition());
    }

}
