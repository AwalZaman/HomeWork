package hw9Q2Encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;

	/*
	 * The Employee class declares private variables -> name,age,sex,usCitizen Since they are private, the code from the outside of this class cannot access the variable directly
	 * Instead, the outside code has to invoke the getter -> getNumber(), and the setter -> setNumber(), in order to read or update the variable Getter and setter are also known as
	 * accessor and mutator in Java
	 */

	// Getter is a method that reads the value of a variable.
	public String getName() {
		return name;
	}

	// The setter method sets a value of the private variable which can be accessed from another class.
	// Setter is a method that updates the value of a variable.
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