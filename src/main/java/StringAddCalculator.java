import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (text == null ){
            return 0;
        }
        if (text.isEmpty()){
            return 0;

        }
        List<Integer> integers = Arrays.stream(split(text)).mapToInt(Integer::parseInt).boxed().collect(toList());
        if(integers.stream().anyMatch(n -> n < 0)) {
            throw new RuntimeException();
        }
        return integers.stream().mapToInt(Integer::intValue).sum();
    }
    private static String[] split(String text){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
            // 덧셈 구현
        }
        return text.split("[,:]");
    }
}
