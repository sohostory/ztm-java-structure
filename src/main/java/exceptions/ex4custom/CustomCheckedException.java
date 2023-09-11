package exceptions.ex4custom;

public class CustomCheckedException {
    public static void validateAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 120) {
            throw new InvalidAgeException("the age is invalid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(121);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
