package Exo;

public class Person {
	
	 String name = "";
	 Integer age = 0;
	 double salaire = 0;
	 
	public Person() {
		super();
		this.name = "";
		this.age = 0;
		this.salaire = 0;
	}
	
	public Person(String name, Integer age, double salaire) {
		super();
		this.name = name;
		this.age = age;
		this.salaire = salaire;
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
		this.salaire = -1;
	}
	
	public void displayInfo() {
		System.out.println("Votre nom est " + this.name + "\n Votre age est " + this.age + " ans " + "\n Votre salaire est " + this.salaire + " FCFA");
	}

	public static void main(String[] args) {
		
		Person person_one = new Person();
		Person person_twoo = new Person("Paul", 27, 233.3);
		person_one.displayInfo();
		person_twoo.displayInfo();

		Person person_three = new Person("Philipe", 36);
		person_three.displayInfo();
		
		if (person_three.salaire == -1) {
			System.out.println("Salaire non fournis");
		}

	}

}
