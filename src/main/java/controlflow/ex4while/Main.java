package controlflow.ex4while;

public class Main {
    public static void main(String[] args) {
        int n = 9;
        int num = 1;
        int counter = 0;

        while (counter < n) {
            if(num % 2 == 0) {
                System.out.println(num);
                counter++;
            }
            num++;
        }
    }
}
