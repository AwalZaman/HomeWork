package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	// Default Constructor
	public Daughter() {
		super("Chester Bennington", 38, 'M', true); // Parameterized constructor called from father
		super.familyName = "Ches";
		super.father();
		super.fatherInfo("Chester", 38, 'M', true);
		System.out.println("The family name is: " + familyName);
		System.out.println("default constructor from daugther");
	}

	public Daughter(String birthMonth, int age) {
		super(); // default constructor called from father
		// super () --> represent the default constructor of parent class
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter Constructor -> Born in: " + birthMonth + ", Age: " + age);
	}

	public void daughter() {
		// Parameterized constrcutor Father can't be called in method
		// super("Eddie", 50, 'M', true);
		super.familyName = "Eddie";
		super.father();
		super.fatherInfo("Edward MJ", 50, 'M', true);
		System.out.println("The family name is: " + familyName);
		System.out.println("Daughter default method");
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter Info Parameter -> Born in: " + birthMonth + ", Age: " + age);
	}
}
