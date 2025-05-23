import java.util.Scanner;

public class StudentGradeTrackerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        double[] grades = new double[n];

        // Input grades
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter grade for student " + (i + 1) + ": ");
                double grade = scanner.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    grades[i] = grade;
                    break;
                } else {
                    System.out.println("Grade must be between 0 and 100.");
                }
            }
        }

        // Initialize values
        double total = 0;
        double highest = grades[0];
        double lowest = grades[0];

        // Process grades
        for (double grade : grades) {
            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = total / n;

        // Output
        System.out.println("\n--- Grade Summary ---");
        System.out.printf("Average grade: %.2f\n", average);
        System.out.printf("Highest grade: %.2f\n", highest);
        System.out.printf("Lowest grade: %.2f\n", lowest);
    }
}
