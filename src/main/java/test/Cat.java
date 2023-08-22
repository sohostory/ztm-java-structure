package test;

public class Cat extends Animal {
    static public int numOfNipples = 8;
    private String attitude;
    public boolean legs;

    public Cat(String name, String attitude) {
        super(name);
        this.attitude = attitude;
    }

    public void makeNoise() {
        this.meow();
        this.legs = this.hasLegs();
    }

    public void meow() {
        System.out.println("meow");
    }

    public void color() {
//        super.color();
        System.out.println("yellow");
    }

    public void cantTouchThis() {
        System.out.println("no");
    }
}
