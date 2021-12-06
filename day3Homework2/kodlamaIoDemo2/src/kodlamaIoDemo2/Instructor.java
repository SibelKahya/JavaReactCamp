package kodlamaIoDemo2;

public class Instructor extends User {
	
	private double salary;
	
	public Instructor() {
		
	}


	public Instructor(double salary) {
		super();
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


}
