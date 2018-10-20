package section5.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section5.entities.Employee;

public class ProgramEmployee {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			list.add( new Employee(id, name, salary) );
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int searchId = sc.nextInt();
		Employee emp = list.stream().filter( x -> x.getId() == searchId ).findFirst().orElse(null);
		if( emp != null ) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary( percentage );
		} else
			System.out.println("This id does not exist!");
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee e : list) {
			System.out.println(e.toString());
		}
		
		sc.close();
	}
}
