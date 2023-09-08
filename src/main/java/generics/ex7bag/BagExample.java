package generics.ex7bag;

public class BagExample {
    public static void main(String[] args) {
        Bag<String> coach = new Bag<>();
        coach.addItem("apple");
        coach.addItem("pear");

        Bag<Integer> apple = new Bag<>();
        apple.addItem(1);
        apple.addItem(3);
    }
}
