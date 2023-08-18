package controlflow.ex2grade;

public class Main {
    public static void main(String[] args) {
        char grade = 'G';
        String comment;

        switch (grade) {
            case 'A':
                comment = "You got an A";
                break;
            case 'B':
                comment = "You got an B";
                break;
            case 'C':
                comment = "You got an C";
                break;
            case 'D':
                comment = "You got an D";
                break;
            case 'F':
                comment = "You got an F";
                break;
            default:
                comment = "No idea.";

        }

        System.out.println(comment);
    }
}
