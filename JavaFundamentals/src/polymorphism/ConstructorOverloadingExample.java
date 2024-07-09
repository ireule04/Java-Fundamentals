package polymorphism;



class Student{
	
	//Date Members
	int studentId;
	String studentName;
	int studentAge;
	
	//Default Constructor
	
	public Student() {
		this.studentId = 100;
		this.studentAge = 23;
		this.studentName = "Unknown";
		
	}
	//Paramaterized Constructor
	public Student(int studentId, String studentName, int studentAge) {
		//Writing this is not necessary
		this.studentId = studentId;		
		this.studentName = studentName;
		this.studentAge = studentAge;
		
	}
	
	public Student(int studentId, int StudentAge, String studentName) {
		//Writing this is not necessary
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentName = studentName;
		
	}

	
	public void displayDetails() {
		System.out.println("Student Id: "+studentId);
		System.out.println("Studnet name: "+studentName);
		System.out.println("Student Age: "+studentAge);
		
	}
	
}

public class ConstructorOverloadingExample {
	public static void main(String[] args) {
		

		
		Student student = new Student();
		student.displayDetails();
		
		System.out.println("-------------------------------");
		
		Student student1 = new Student(103,"Ramesh",10);
		student1.displayDetails();
		
		System.out.println("-------------------------------");
		
		Student student2 = new Student(103,"Hari",30);
		student2.displayDetails();
		
		
		
		
		
		
	}

}





