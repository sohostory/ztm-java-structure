package functionalprogramming.ex5foreach;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> vegetables = Arrays.asList("pepper", "cucumber", "onion", "lettuces");

        for(String s : vegetables) {
            System.out.println(s);
        }

        vegetables.forEach(vegetable -> System.out.println(vegetable));
    }
}
