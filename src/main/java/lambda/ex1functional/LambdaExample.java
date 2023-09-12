package lambda.ex1functional;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator add = (x, y) -> x + y;

        int sum = add.operate(3, 5);
        System.out.println(sum);

        NumericOperator max = (x, y) -> Math.max(x, y);
        int maxNum = max.operate(1, 20);
        System.out.println(maxNum);
    }
}
