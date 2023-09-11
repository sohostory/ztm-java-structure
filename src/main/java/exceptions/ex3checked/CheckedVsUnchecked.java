package exceptions.ex3checked;

public class CheckedVsUnchecked {
    public static void validateString(String s) throws EmptyStringException{
        if(s.isEmpty()) {
            throw new EmptyStringException("The string cannot be empty");
        }
    }
}
