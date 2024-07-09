package oops;

class Person{
	
	private String firstName;
	private String lastName;
	private int Age;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return this.Age;
	}
	public void setAge(int age) {
		if(age>=18)
			this.Age = age;
		else
			System.out.println("Invalid Age!!");
	}
}


public class EncapsulationExample {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setFirstName("King");
		System.out.println(person.getFirstName());
		person.setLastName("Kochhar");
		System.out.println(person.getLastName());
		person.setAge(50);
		System.out.println(person.getAge());
		
		
	
	}

}
