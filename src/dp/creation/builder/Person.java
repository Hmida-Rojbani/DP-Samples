package dp.creation.builder;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private int age; 
	private LocalDate birthDate;
	private int cin;
	private String address;

	
	private Person(PersonBuilder personBuilder) {
		super();
		this.name = personBuilder.name;
		this.age = personBuilder.age;
		this.birthDate = personBuilder.birthDate;
		this.cin = personBuilder.cin;
		this.address = personBuilder.address;
	}

	public static class PersonBuilder{
		private String name;
		private int age; 
		private LocalDate birthDate;
		private int cin;
		private String address;
		
		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder birthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
			return this;
		}
		
		public PersonBuilder cin(int cin) {
			this.cin = cin;
			return this;
		}
		
		public PersonBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthDate=" + birthDate + ", cin=" + cin + ", address="
				+ address + "]";
	}

}
