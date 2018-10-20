package section3.entities;

public class Student {
	
	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;
	private double gradeMin = 60.00;
	
	public double finalGrade() {
		return gradeOne + gradeTwo + gradeThree;
	}
	
	public String isPassed() {
		if(finalGrade() >= gradeMin) 
			return "PASSED";
		else {
			double calculateGrade = gradeMin - finalGrade();
			return String.format("FAILED%nMISSING %.2f POINTS", calculateGrade );
		}
		
	}
}
