package functionalprogramming.ex3terminal;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 15, 34, 45, 21, 13);
        long countEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0).count();
        System.out.println("Count of Evens: " + countEvenNumbers);
    }
}
