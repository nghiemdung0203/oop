package Family;

import Abstract_class.Person;

public class Father extends Person {
	private String career;
	
	
	public Father(String Name, int age, String gender, String address, String career) {
		super(Name, age, gender, address);
		this.career = career;
	}
	
	public String getCareer() {
		return career;
	}

	@Override
	public void displayInfo() {
		System.out.println("Father: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender() + ", Address: " + getAddress() + ", Profession: " + getCareer());
	}
}
