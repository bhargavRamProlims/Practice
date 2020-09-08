package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("printing to test initiate");
		Address a = new Address(4,"DAE","Hyderabad","Hyderabad","Telangna",500062);
		Employee e = new Employee("Senior",390000,a,a);
		printAnyobject(e);
		System.out.println("\nPrinting the address");
		printAnyobject(a);
		
	}
	public static void printAnyobject(Object o) {
		if(o instanceof Employee) {
			Employee e =(Employee)o;
			e.printEmployee();
		}
		else if(o instanceof Address) {
			Address a = (Address)o;
			a.printAddress();
		}
		else {
			System.out.println("You might be java.lang.Object or "+o.getClass());
		}
		
	}

}
