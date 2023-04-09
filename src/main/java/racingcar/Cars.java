package racingcar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars =cars;
    }

    public void race(int tryCount){
        for(int i=0;i<tryCount;i++){
            race();
        }
    }
    public void race(){
        for (Car car : cars) {
            car.race();
        }
        printCars();
    }

    public int maxPosition() {
        return cars.stream().map(Car::getPosition).max(Integer::compare).orElse(-1);
    }

    public Cars winners() {
        return new Cars(cars.stream().filter(car -> car.getPosition() == maxPosition()).collect(Collectors.toList()));
    }
    public void printWinners(){
        Cars winners = this.winners();
        winners.printNames();
    }
    public void printNames(){
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            result.append(car.getName()).append(", ");
        }
        System.out.println(result.substring(0,result.length() - 2) + "가 최종 우승했습니다.");
    }

    public void printCars() {
        for (Car car : cars) {
            int position = car.getPosition();
            StringBuilder dashes = new StringBuilder("-");
            for(int i =0; i<position;i++){
                dashes.append("-");
            }
            System.out.println(car.getName() + " : "+ dashes );
        }
        System.out.println("");
    }

}
