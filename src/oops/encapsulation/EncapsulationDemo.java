package oops.encapsulation;

import java.io.Console;
//import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		//class Person encapsulates all attributes and behavior related to a logical entity(person)
		//but in main1() , all variables are scattered through out and easy to manipulate 
		//non encapsulated code is clumsy and error prone
		Person sanket = new Person("sanket", "ghatte", 18, "address", "address2", "solapur", "MH");
		System.out.println(sanket.getFirstName());
		System.out.println(sanket.getLastName());
		System.out.println(sanket.getAge());
		System.out.println(sanket.getAddressLine1());
		System.out.println(sanket.getAddressLine2());
		System.out.println(sanket.getCity());
		System.out.println(sanket.getState());
		System.out.println("---------------------------------");
		System.out.println(sanket);
		
		Person amit = new Person("amit", "yele", 18, "address", "address2", "solapur", "MH");
		System.out.println(amit.getFirstName());
		System.out.println(amit.getLastName());
		System.out.println(amit.getAge());
		System.out.println(amit.getAddressLine1());
		System.out.println(amit.getAddressLine2());
		System.out.println(amit.getCity());
		System.out.println(amit.getState());
		System.out.println("----------------------------------");

	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		String firstName, lastName;
		int age;
		String addressLine1, addressLine2;
		String city, state;
		// Scanner sc =new Scanner(System.in);
		// System.out.println("Enter first name : ");
		// Console c = System.console();
		// firstName=c.readLine();
		// firstName = sc.nextLine();
		// System.out.println("")
		firstName = "Sanket";
		lastName = "Ghatte";
		age = 18;
		addressLine1 = "line1 ";
		addressLine2 = "line2";
		city = "Solapur";
		state = "Maharashtra";
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(addressLine1);
		System.out.println(addressLine2);
		System.out.println(city);
		System.out.println(state);
		System.out.println("------------------------------");

		String fName = "Amit";
		String lName = "Yele";
		int agee = 18;
		String address = "address";
		String city1 = "Solapur";
		String state1 = "MH";
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(age);
		System.out.println(address);
		System.out.println(city1);
		System.out.println(state1);
		System.out.println("------------------------------");

		firstName = "sanket123";
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(addressLine1);
		System.out.println(addressLine2);
		System.out.println(city);
		System.out.println(state);
		System.out.println("------------------------------");

	}

}

class Person {
	private String firstName, lastName;
	private int age;
	private String addressLine1, addressLine2;
	private String city, state;

	public Person(String firstName, String lastName, int age, String addressLine1, String addressLine2, String city,
			String state) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
	}

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
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + "]";
	}

}
