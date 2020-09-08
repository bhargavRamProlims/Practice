package inheritance;

public class Address {
	
	private int aid;
	private String streetname;
	private String city;
	private String district;
	private String state;
	private int zipCode;
	
	public Address(int aid, String streetname, String city, String district, String state, int zipCode) {
		super();
		this.aid = aid;
		this.streetname = streetname;
		this.city = city;
		this.district = district;
		this.state = state;
		this.zipCode = zipCode;
	}

	public Address() {

	}
	public void printAddress() {
		System.out.println("aid: "+aid);
		System.out.println("street name: "+streetname);
		System.out.println("city: "+city);
		System.out.println("district: "+district);
		System.out.println("state: "+state);
		System.out.println("zipcode: "+zipCode);
	}

}
