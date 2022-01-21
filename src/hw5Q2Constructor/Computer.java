package hw5Q2Constructor;

public class Computer {
//declared variables
	public String brand;
	public String model;
	public String oS;
	public int price;
	public char grade;
	public boolean madeInUsa;

	// default constructor
	public Computer() {
		System.out.println("This is from default Constructor of Computer class");
	}

	// parameterized constructor

	public Computer(String brand, String model, String oS, int price, char grade, boolean madeInUsa) {

		System.out.println("My Brand: " + brand + ", Model: " + model + ", oS: " + oS + ", Price: " + price + "$, "
				+ "Grade: " + grade + ", Made in USA? Ans: " + madeInUsa);
	}

}