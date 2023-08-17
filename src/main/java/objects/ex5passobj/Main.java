package objects.ex5passobj;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jay";
        person.age = 30;

        modifyPerson(person);

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "John";
        p.age = 15;
    }
}
