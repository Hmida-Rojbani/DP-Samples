package dp.creation.builder;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		//Person p = new Person("Ali", 25, null, 0, null);
		//Person p2 = new Person("Sarra", 0, LocalDate.of(2000,3,3), 0, "Tunis");
		Person p = new Person.PersonBuilder().age(25).name("Ali").address("Tunis").build();
		System.out.println(p);
	}

}
