package hw9Q2Encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;

	/*
	 * When we create the getter method that returns the value of the private variable we are not getting the address but instead creating a temporary copy that holds the value of
	 * the returned value
	 */
	public String getName() {
		return name;
	}

	// The setter method sets a value to the private variable which can't be done when it's from another class.
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
}