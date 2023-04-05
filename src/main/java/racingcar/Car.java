package racingcar;

import java.util.Random;

public class Car {
    private final Position position = new Position();
    private final CarName name;
    private final Random random;
    public Car(String name) {
        this.random = new Random();
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

    public boolean canMove(int i) {
        return i >=4;
    }
    public void race(){
        if(canMove(random.nextInt(10))){
            move();
        }
        System.out.println(getName()+ " : " + position.getPosition());
    }
}
