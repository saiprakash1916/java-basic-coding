package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyWords {
    public static void main(String[] args) {
        String str = "java java spring";

        Map<String, Integer> result = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.summingInt(w -> 1)));

        System.out.println(result);
    }
}
