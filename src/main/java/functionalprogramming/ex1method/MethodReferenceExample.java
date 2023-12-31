package functionalprogramming.ex1method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Peanut", "Snow");
        List<String> uppercaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase Names: " + uppercaseNames);
    }
}
