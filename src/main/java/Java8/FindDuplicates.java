package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 10, 30, 50, 60, 40, 30);
        List<Integer> result = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
