package mygroups.myprojects.model;

public class person {
	String firstname;
	String secondname;
	Address address;
	String[] cars;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String[] getCars() {
		return cars;
	}
	public void setCars(String[] cars) {
		this.cars = cars;
	}

}
