package controlflow.ex6sumarr;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,6,7,8,9,10};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
