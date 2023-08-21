package string.ex3immutable;

public class Immutability {
    public static void main(String[] args) {
        String str = "This is a string object.";

        String newStr = str.toUpperCase();

        System.out.println(str);
        System.out.println(newStr);
    }
}
