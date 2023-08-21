package string.ex5stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("This is a string.");
        StringBuilder str2 = new StringBuilder("This is a string.");

        System.out.println(str1.toString().equals(str2.toString()));

        System.out.println(str1.append(str2));
        System.out.println(str1.reverse());

    }
}
