package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.nextLine();
        Cars cars = new Cars(Arrays.stream(carNames.split(",")).map(Car::new).collect(Collectors.toList()));
        System.out.println("시도할 회수는 몇회인가요?");
        System.out.println("실행 결과");
        cars.race(scanner.nextInt());
        cars.printWinners();
    }
}
