package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PositionTest {
    @Test
    public void move(){
        Position position = new Position();
        position.move();
        assertThat(position.getPosition()).isEqualTo(1);
    }
}
