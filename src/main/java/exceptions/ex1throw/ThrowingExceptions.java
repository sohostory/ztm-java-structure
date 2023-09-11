package exceptions.ex1throw;

public class ThrowingExceptions {
    public static void validateNumber(int num) {
        if(num < 0) {
           throw new IllegalArgumentException("number can not be a negative");
        }
    }
}
