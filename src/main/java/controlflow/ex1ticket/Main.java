package controlflow.ex1ticket;

public class Main {
    public static void main(String[] args) {
        int age = 9;

        if (age < 5) {
            System.out.println("It's free.");
        } else if (age >= 5 && age < 12) {
            System.out.println("It's $5");
        } else if (age >= 12 && age < 18) {
            System.out.println("It's $10");
        } else {
            System.out.println("It's $15");
        }
    }
}
