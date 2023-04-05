package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @Test
    public void move(){
        Car car = new Car("ZZZ");
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }
    @Test
    public void name(){
        Car car = new Car("GWAK");
        assertThat(car.getName()).isEqualTo("GWAK");
    }
}
