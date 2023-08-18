package controlflow.ex8avg;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, 10, 19, 12, 14};
        int sum = 0;
        int count = 0;

        for (int number:numbers) {
            if(number % 2 == 1) {
                sum += number;
                count++;
            }
        }

        double avg = (double) sum/count;

        System.out.println(count + ": " + avg);

    }
}
