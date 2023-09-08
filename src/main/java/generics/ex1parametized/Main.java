package generics.ex1parametized;

public class Main {
    public static void main(String[] args) {
        Box<Integer> numbers = new Box<>();
        numbers.setContent(10);

        Box<String> letters = new Box<>();
        letters.setContent("This is a string.");
    }
}
