package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        Integer secondHighest = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);

        System.out.println(secondHighest);
    }
}
