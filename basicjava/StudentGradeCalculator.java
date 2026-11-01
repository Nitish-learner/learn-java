
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Invalid marks!");
        }

        sc.close();
    }
}
