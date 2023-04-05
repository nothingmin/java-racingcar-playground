package racingcar;

public class Car {
    private Integer position = 0;

    public void move() {
        position += 1;
    }

    public int getPosition() {
        return position;
    }
}
