package constructors;

import java.util.Scanner;



class Students{
	
	//Date Members
	int studentId;
	String studentName;
	int studentAge;
	
	//Default Constructor
	
	public Students() {
		this.studentId = 100;
		this.studentAge = 23;
		this.studentName = "Unknown";
		
	}
	//Paramaterized Constructor
	public Students(int sId, String sName, int sAge) {
		//Writing this is not necessary
		this.studentId = sId;
		this.studentAge = sAge;
		this.studentName = sName;
		
	}

	
	public void displayDetails() {
		System.out.println("Student Id: "+studentId);
		System.out.println("Studnet name: "+studentName);
		System.out.println("Student Age: "+studentAge);
		
	}
	
}

public class ConstructorExample {
	
	public static void main(String[] args) {
		
		Students student = new Students();
		student.displayDetails();
		
		Students student1 = new Students(1001,"Tiger",23);
		student1.displayDetails();
		
		Students student2 = new Students(1001,"B",23);
		student2.displayDetails();
		
		
		
		
	}

}
