import java.util.Scanner;
public class StudentGradeCalculator {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Student Grade Calculator");
 System.out.print("Enter the number of subjects: ");
 int numSubjects = scanner.nextInt();
 double totalScore = 0;
 for (int i = 1; i <= numSubjects; i++) {
 System.out.print("Enter the score for Subject " + i + ": ");
 double score = scanner.nextDouble();
 if (score < 0 || score > 100) {
 System.out.println("Invalid score. Please enter a score between 0 and 100.");
 i--; 
 continue;
 }
 totalScore += score;
 }
 double average = totalScore / numSubjects;
 System.out.println("Average Grade: " + average);
 if (average >= 91) {
 System.out.println("Grade: o");
 } 
 else if (average >= 81)
 {
 System.out.println("Grade: A+");
 } 
 else if (average >= 71) 
 {
 System.out.println("Grade: A");
 } 
 else if (average >= 61) 
 {
 System.out.println("Grade: B+");
 } 
 else if (average >= 51) 
 {
 System.out.println("Grade: B");
 }
 else if (average >= 41) 
 {
 System.out.println("Grade: P");
 }
 else 
 {
 System.out.println("Grade: F");
 }
 scanner.close();
 }
}
