package interfaces.ex1interfaces;

public interface Countable {
    default void printInfo() {
        System.out.println("info");
    }
}
