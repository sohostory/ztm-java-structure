package generics.ex6map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("Jim", 15);
        people.put("Bob", 25);
        people.put("Dude", 45);
    }
}
