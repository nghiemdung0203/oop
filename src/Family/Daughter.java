package Family;

public class Daughter extends Father {
	
	private String hobby;

	public Daughter(String Name, int age, String gender, String address, String career, String hobby) {
		super(Name, age, gender, address, career);
		this.hobby = hobby;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Daughter: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress() + ", Hobby: " + getHobby());
	}
	
}
