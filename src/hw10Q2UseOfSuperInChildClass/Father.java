package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constructor
	public Father() {
		System.out.println("default constructor from father");
	}

	// parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father Constructor -> Name: " + name + ", Age: " + age + ", Sex: " + sex + " and US Citizen? : " + usCitizen);
	}

	// default method
	public void father() {
		System.out.println("default method from father");
	}

	// parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father Info Method -> Name: " + name + ", Age: " + age + ", Sex: " + sex + " and US Citizen? : " + usCitizen);
	}
}