package dhanu.studentcal;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	
		while(true){
		
		System.out.println("Welcome to the Student Grade Calculator!");

		
		System.out.print("Enter the marks obtained in Subject 1: ");
		int subject1Marks = scanner.nextInt();

		System.out.print("Enter the marks obtained in Subject 2: ");
		int subject2Marks = scanner.nextInt();

		System.out.print("Enter the marks obtained in Subject 3: ");
		int subject3Marks = scanner.nextInt();

		
		int totalMarks = subject1Marks + subject2Marks + subject3Marks;

		
		int totalSubjects = 3;
		double averagePercentage = (double) totalMarks / totalSubjects;

		
		String grade;
		if (averagePercentage >= 90) {
			grade = "A+";}  
		  else if (averagePercentage >= 80) {
			grade = "A";}
		  else if (averagePercentage >= 70) {
			grade = "B";}
		  else if (averagePercentage >= 60) {
			grade = "C";}
		  else if(averagePercentage>=40) {
				grade ="D";}
		 else {
			grade = "FAIL";
		}

		
		System.out.println("\nResults:");
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Percentage: " + averagePercentage + "%");
		System.out.println("Grade: " + grade);

		System.out.print("Do you want to check again? (yes/no): ");
        String playAgain = scanner.next().toLowerCase();
        if (!playAgain.equals("yes")) {
            break;
        }
		
		//scanner.close();
		}
	}
}
