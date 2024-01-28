package Main;

import Family.Daughter;
import Family.Father;

public class main {
	public static void main(String[] args) {
		Father father = new Father("Long", 33, "Male", "Hoàng Mai, Hà Nội", "Developer");
		
		father.displayInfo();
		
		Daughter daughter = new Daughter("Thương", 22, "Female", "Thanh Xuân, Hà Nội", "Auditor", "Smoke");
		
		daughter.displayInfo();
	}
}
