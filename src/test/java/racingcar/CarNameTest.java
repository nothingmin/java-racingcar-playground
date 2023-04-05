package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    @Test
    public void long_name(){
        assertThatThrownBy(() -> new CarName("looonngname"))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    public void get_name(){
        CarName name = new CarName("zzzz");
        assertThat(name.getName()).isEqualTo("zzzz");
    }
}
