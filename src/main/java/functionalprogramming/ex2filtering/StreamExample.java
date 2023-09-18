package functionalprogramming.ex2filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 7, 10);
        List<Integer> evenSqureNumbers = numbers.stream()
                .filter(n -> n % 2 != 0).map(n -> n * n).toList();
        System.out.println("Even Squre Number: " + evenSqureNumbers);
    }
}
