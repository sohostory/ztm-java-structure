package functionalprogramming.ex6reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquresExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int totalSquared = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Total Squared: " + totalSquared);
    }
}
