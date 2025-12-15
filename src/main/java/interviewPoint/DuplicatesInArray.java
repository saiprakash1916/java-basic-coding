package interviewPoint;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInArray {

    static void findDuplicatedByUsingJava8(int[] inputArray){
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicatesInArray = Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(duplicatesInArray);
    }

    static void duplicateElementsByUsingHashMap(int[] inputArray){
        Map<Integer, Integer> map = new HashMap<>();
        for (int elements : inputArray){
            if (map.get(elements) == null){
                map.put(elements, 1);
            }else {
                map.put(elements, map.get(elements) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet){
            if (entry.getValue() > 1){
                System.out.println("Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
            }
        }
    }
    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};
        findDuplicatedByUsingJava8(inputArray);
        duplicateElementsByUsingHashMap(inputArray);
    }
}
