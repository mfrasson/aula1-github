package section5.application;

import java.util.Locale;
import java.util.Scanner;

import section5.entities.Student;

public class ProgramRent {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
//		Student[] student = new Student[rooms];
		Student[] busyRoomStudent = new Student[10];
		int room = 1;
		
		for (int i = 0; i < rooms; i++) {
			System.out.println();
			System.out.printf("ROOM #%d%n", room);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numberRoom = sc.nextInt();
			room++;
			busyRoomStudent[numberRoom] = new Student(name, email, numberRoom);
		}

		System.out.println();
		
		System.out.println("Busy rooms:");
		for(int i=0; i < busyRoomStudent.length; i++) {
			if(busyRoomStudent[i] != null) 
				System.out.printf("%d: %s, %s%n", busyRoomStudent[i].getRoom(), busyRoomStudent[i].getName(), busyRoomStudent[i].getEmail());
			
		}
		
		sc.close();
	}
	
}
