package lambda.ex4functional;

import org.w3c.dom.ls.LSOutput;

public class LambdaExample {
    public static void main(String[] args) {
        StringFormatter sf = input -> input.toUpperCase();
        System.out.println(sf.formatter("upper case me"));
    }

}
