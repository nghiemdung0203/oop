package Abstract_class;

public abstract class Person {
	private String name;
	private int age;
	private String gender;
	private String address;
	
	public Person(String Name, int age, String gender, String address) {
		this.name = Name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	public abstract void displayInfo();
	
	public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getAddress() {
        return address;
    }
}	
