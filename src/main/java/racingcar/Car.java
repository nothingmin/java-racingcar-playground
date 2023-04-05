package racingcar;

public class Car {
    private final Position position = new Position();
    private final CarName name;

    public Car(String name) {
        this.name = new CarName(name);
    }

    public void move() {
        position.move();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public String getName() {
        return name.getName();
    }

}
