package constructor.ex3super;

public class SuperThisExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("abc", "bdc", 3);
        Dog dog2 = new Dog();

        System.out.println(dog1);
        System.out.println(dog2);

    }
}
