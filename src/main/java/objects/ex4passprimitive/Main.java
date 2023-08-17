package objects.ex4passprimitive;

public class Main {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("Before: " + number);

        modifyNumber(number);
        System.out.println("After: " + number);

    }

    public static void modifyNumber(int num) {
        num = num * 2;
    }
}
