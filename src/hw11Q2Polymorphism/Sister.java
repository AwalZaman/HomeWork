package hw11Q2Polymorphism;

/*
 * When different methods exist with the same method name but with different parameters or signature, it is called method overloading. 
 * Method Overloading occurs during compile time. Overloaded methods are bonded using static binding at compile time
 * Also known as Early binding or static binding or compile time polymorphism
 */

public class Sister {


	// Void Type Method
	public void sister() {
		System.out.println("This is the void type method for Sister Class");
	}

	// Return type parameterized method
	public int sister(int age1) {
		int total1 = age1;
		System.out.println("1st total is: " + total1);
		return total1;
	}

	public int sister(int age1, int age2) {
		int total2 = age1 + age2;
		System.out.println("2nd total is: " + total2);
		return total2;
	}

	public int sister(int age1, int age2, int age3) {
		int total3 = age1 + age2 + age3;
		System.out.println("3rd total is: " + total3);
		return total3;
	}

	public int sister(String age4, int age5) {
		int total4 = Integer.parseInt(age4) + age5;
		System.out.println("4th total is: " + total4);
		return total4;
	}

	// static method
	public static int sister(int age1, String age4) {
		int total5 = age1 + Integer.parseInt(age4);
		System.out.println("Static method: total is: " + total5);
		return total5;
	}

	// final method
	public final int sister(int age2, int age3, int age5, int age6) {
		int total6 = age2 + age3 + age5 + age6;
		System.out.println("Final method: total is: " + total6);
		return total6;
	}

	// Void Type Parameterized Method
	public void sister(String age4) {
		int total7 = Integer.parseInt(age4);
		System.out.println("7th total is: " + total7);
	}
}
