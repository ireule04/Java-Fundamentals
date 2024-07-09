package oops;

import java.util.Scanner;

class Student{
	
	//Date Members
	int studentId;
	String studentName;
	int studentAge;
	Scanner scanner = new Scanner(System.in);
	
	//Member Function
	public void acceptDetails() {
		System.out.print("Enter Student ID: ");
		studentId = scanner.nextInt();
		System.out.print("Enter Student name: ");
		studentName = scanner.next();
		System.out.print("Enter the age: ");
		studentAge = scanner.nextInt();
				
	}
	
	public void displayDetails() {
		System.out.println("Student Id: "+studentId);
		System.out.println("Studnet name: "+studentName);
		System.out.println("Student Age: "+studentAge);
		
	}
	
}

class Marks extends Student{
	
	protected float objectiveMarks;
	protected float subjectiveMarks;
	
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Objective Marks ");
		objectiveMarks = scanner.nextFloat();
		
		System.out.print("Subjective Marks: ");
		subjectiveMarks = scanner.nextFloat();
		
		
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks: "+objectiveMarks);
		System.out.println("Subjective Marks: "+subjectiveMarks);

		
	}
}

class Sports extends Marks{
	protected float score;
	
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Sports score: ");
		score = scanner.nextFloat();
		
	
		
		
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Sport Score:  "+score);
		

		
	}
}

class Result extends Sports{
	private float totalMarks, averageMarks;
	void calculate() {
		totalMarks = objectiveMarks + subjectiveMarks + score;
		averageMarks = totalMarks / 3;
		System.out.println("TOtal Marks: "+totalMarks);
		System.out.println("Average Marks: "+averageMarks);
	}
	
	
}
	

public class ClassesAndObjectsExample {
	
	public static void main(String[] args) {
		
		Result obj = new Result();
		obj.acceptDetails();
		obj.displayDetails();
		obj.calculate();
		
		
//		Marks marks = new Marks();
//		marks.acceptDetails();
////		marks.acceptDetails();
//		marks.displayDetails();
////		marks.displayDetails();
		
		
		//Creating an object of class student
		
//		Student student = new Student();
//		student.acceptDetails();
//		student.displayDetails();
//		
//		Student student1 = new Student();
//		student1.acceptDetails();
//		student1.displayDetails();
//		
//		System.out.println(student1.studentAge);
		
	}

}
