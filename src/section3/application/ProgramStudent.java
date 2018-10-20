package section3.application;

import java.util.Locale;
import java.util.Scanner;

import section3.entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Student name:");
		student.name = sc.next();
		student.gradeOne = sc.nextDouble();
		student.gradeTwo = sc.nextDouble();
		student.gradeThree = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade() );
		System.out.printf(student.isPassed());
		
		sc.close();
	}

}
