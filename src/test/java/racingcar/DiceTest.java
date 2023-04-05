package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class DiceTest {
    @Test
    public void canMove_at_0(){
        Dice dice = new Dice();
        Assertions.assertThat(dice.canMove(0)).isEqualTo(false);
    }
    @Test
    public void canMove_at_4(){
        Dice dice = new Dice();
        Assertions.assertThat(dice.canMove(4)).isEqualTo(true);
    }
    @Test
    public void canMove_at_9(){
        Dice dice = new Dice();
        Assertions.assertThat(dice.canMove(9)).isEqualTo(true);
    }
}
