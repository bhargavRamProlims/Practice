package inheritance;

public class Employee {
	
	private String designation;
	private double salary;
	private Address presentAddress;
	private Address permanentAddress;
	
	public Employee(String designation, double salary, Address presentAddress,
			Address permanentAddress) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
	}
	public Employee() {
		
	}
	public void printEmployee() {
		System.out.println("Printing employee details");
		System.out.println("designation: "+designation);
		System.out.println("salary: "+salary);
//		System.out.println("present address: "+presentAddress);
//		System.out.println("permanent address: "+permanentAddress);
	}
}
