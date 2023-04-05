package racingcar;

public class Car {
    private Integer position = 0;
    private final CarName name;

    public Car(String name) {
        this.name = new CarName(name);
    }

    public void move() {
        position += 1;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name.getName();
    }

}
