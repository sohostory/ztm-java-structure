package controlflow.ex7grades;

public class Main {
    public static void main(String[] args) {
        int[] grades = {39, 79, 99, 100, 95};
        int high = grades[0];
        int low = grades[0];

        for (int grade : grades) {
            if(grade > high) {
                high = grade;}
            if (grade < low) {
                low = grade;
            }
        }

        System.out.println("High grade: " + high);
        System.out.println("Low grade: " + low);
    }
}
