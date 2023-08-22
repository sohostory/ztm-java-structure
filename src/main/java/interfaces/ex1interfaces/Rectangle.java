package interfaces.ex1interfaces;

public class Rectangle implements Drawable, Countable {
    @Override
    public void printInfo() {
        System.out.println("Rectangle Info.");
    }

    @Override
    public void draw() {
        System.out.println("Drawing something");
    }
}
