package interviewPoint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class emptyStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Welcome", "", "to", "the", "World", " ", null);
        List<String> result = list
                .stream().filter(s -> s != null && !s.trim().isEmpty())
                .toList();

        System.out.println(result);
    }
}
