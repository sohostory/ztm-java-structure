package access.ex1access;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);
//        System.out.println(person.age);
        System.out.println(person.address);
        System.out.println(person.ssn);
    }
}
