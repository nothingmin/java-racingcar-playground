package racingcar;

public class CarName {
    private final String name;


    public CarName(String name) {
        if(name.length() > 5){
            throw new IllegalArgumentException("이름은 5글자를 초과 할 수 없습니다");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
