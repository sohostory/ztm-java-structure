package generics.ex5queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Character> characters = new LinkedList<>();

        characters.add('a');
        characters.add('b');
        characters.add('c');

    }
}
