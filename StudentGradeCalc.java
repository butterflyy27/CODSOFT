import java.util.Scanner;

public class StudentGradeCalc 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int totalSubjects, totalMarks = 0;
        double averagePercentage;

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        totalSubjects = scanner.nextInt();

        // Input marks for each subject and calculate total marks
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        averagePercentage = (double) totalMarks / totalSubjects;

        // Determine the grade based on the average percentage
        char grade;
        if (averagePercentage >= 90) 
        {
            grade = 'A';
        } 
        else if (averagePercentage >= 80) 
        {
            grade = 'B';
        } 
        else if (averagePercentage >= 70) 
        {
            grade = 'C';
        } 
        else if (averagePercentage >= 60) 
        {
            grade = 'D';
        } 
        else if (averagePercentage >= 50) 
        {
            grade = 'E';
        } 
        else 
        {
            grade = 'F';
        }

        // Display the results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
