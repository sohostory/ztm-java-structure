package test;

public class Animal {
    static public int numOfNipples = 2;
    private String name;

    public Animal () {
        this.name = "no name";
    }
    public Animal(String name) {
        this.name = name;
    }

    public void makeNoise() {};
    public boolean hasLegs() {
        return true;
    }

    public void color() {
        System.out.println("brown");
    }

//    public void cantTouchThis() {
//        System.out.println("yes");
//    }
}
