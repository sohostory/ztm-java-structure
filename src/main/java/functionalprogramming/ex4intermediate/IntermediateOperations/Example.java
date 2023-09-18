package functionalprogramming.ex4intermediate.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pumkin", "Cucumber", "Cake", "Apple", "Chips");
        List<String> newNames = names.stream()
                .filter(name -> name.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(newNames);
    }
}
