import java.util.*;

public class Grades {
    public static void main(String[] args) {
        int testscore;
        Scanner in = new Scanner(System.in);
        
        try {
            System.out.print("Enter Test Score: ");
            testscore = in.nextInt(); // Read user input

            char grade;

            if (testscore >= 80 && testscore <= 100) {
                grade = 'A';
            } else if (testscore >= 75 && testscore <= 79) {
                grade = 'B';
            } else if (testscore >= 70 && testscore <= 74) {
                grade = 'C';
            } else if (testscore >= 65 && testscore <= 69) {
                grade = 'D';
            } else if (testscore >= 0 && testscore <= 64) {
                grade = 'F';
            } else {
                System.out.println("Invalid test score"); // Handle scores outside the valid range
                return; // Exit the program
            }

            System.out.println("Grade: " + grade);
        } finally {
            in.close(); // Always close the Scanner, whether an exception occurred or not
        }
    }
}
