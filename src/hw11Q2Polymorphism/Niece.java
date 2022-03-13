package hw11Q2Polymorphism;

/*
 * When different methods exist with the same method name with same parameters or signature but with different syntax or logic, it is called method overriding. 
 * Method Overriding occurs during run time. Overridden methods are bonded using dynamic binding at runtime.
 *  Also known as Late binding or dynamic binding or runtime polymorphism
 */

public class Niece extends Sister {

	// Void Type Method
	@Override
	public void sister() {
		System.out.println("This is the void type method for Niece Class");
	}

	// Return type parameterized method
	@Override
	public int sister(int age1, int age2) {
		int total2 = age1 + age2 - 20;
		System.out.println("2nd total is: " + total2);
		return total2;
	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int total3 = age1 + age2 + age3 * 2;
		System.out.println("3rd total is: " + total3);
		return total3;
	}

	/*
	 * we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time.
	 * So, we cannot override static methods.
	 * 
	 * If we call a static method by using the parent class object, the original static method will be called from the parent class. 
	 * If we call a static method by using the child class object, the static method of the child class will be called.
	 
	
	@Override
	public static int sister(int age1, String age4) {
		int total5 = age1 * 2 + Integer.parseInt(age4);
		System.out.println("Static method: total is: " + total5);
		return total5;
	}
	 */
	
	/*
	 * Final methods cannot be overridden because the purpose of the "final" keyword is to prevent overriding. Final cannot be overridden because that is the purpose of the keyword, something that cannot be changed or overridden
	
	@Override
	public final int sister(int age2, int age3, int age5, int age6) {
		int total6 = age2 + age3 + age5 + age6 + 6;
		System.out.println("Final method: total is: " + total6);
		return total6;
	}
	 */
	
	// Void Type Parameterized Method
	@Override
	public void sister(String age4) {
		int total7 = Integer.parseInt(age4) / 2;
		System.out.println("7th total is: " + total7);
	}
}
