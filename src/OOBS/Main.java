package OOBS;

import java.util.*;

class Student {
	String name;
	int refNo;

	Student(String name, int refNo) {
		this.name = name;
		this.refNo = refNo;
	}

	public void getDetails() {
		System.out.println("=====================================\nStudent Detail:");
		System.out.println("Name of the Student: " + this.name);
		System.out.println("Register Number:" + this.refNo);
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name of the Student:");
		String name = scanner.nextLine();
		System.out.println("Enter the Register Number:");
		int refNo = scanner.nextInt();
		Student student = new Student(name, refNo);
		student.getDetails();
		scanner.close();

	}

}
