package test;

public class Dog extends Animal {

    public void makeNoise() {
        this.bark();
    }

    public void bark() {
        System.out.println("bark");
    }
}
