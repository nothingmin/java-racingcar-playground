package racingcar;

public class Position {
    private int position=0;
    public void move() {
        position += 1;
    }

    public int getPosition() {
        return position;
    }
}
