package objects.ex2objcomposition;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();

        person.name = "Alex";
        car.model = "K5";
        car.owner = person;

        System.out.println("Owner: " + person.name);
        System.out.println("Model: " + car.model);
    }
}
