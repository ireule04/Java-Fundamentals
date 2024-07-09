package constructors;

class Student{
	//Data Members
	int studentId;
	String studentName;
	int studentAge;
	
	//Default Constructor
	
	public Student() {
		this(101,"Ramesh",23);
		studentId = 100;
		studentName = "Unknown";
		studentAge = 23;		
	}
	//Paramaterized Constructor
	public Student(int studentId, String studentName, int studentAge) {
		//Writing this is not necessary
		this(102,22,"Tiger");
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
	 void displayDetails() {
		System.out.println("Student Id: "+studentId);
		System.out.println("Studnet name: "+studentName);
		System.out.println("Student Age: "+studentAge);		
	}	
}
public class ConstructorChainingExample {
	public static void main(String[] args) {
	
		Student student = new Student();
		student.displayDetails();
		
	}	

}
