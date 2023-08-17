package objects.ex1primitives;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Henry";
        person.age = 15;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
