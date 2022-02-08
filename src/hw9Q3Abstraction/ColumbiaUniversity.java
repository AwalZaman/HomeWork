package hw9Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	// Extends keyword is used for the inheritance in Java for a regular Class
	// Regular Class can inherit other Abstract Class or a regular class by extends keyword
	// Regular Class can't inherit interface by extends keyword
	// Only one inheritance is possible by a regular Class

	// public void chemistry();
	// Resolution: abstract/ declared method not possible in this regular class

	// non abstract/ implemented method
	public void biology() {
		System.out.println("Implemented method biology from Columbia University");
	}

	public ColumbiaUniversity() {
		System.out.println("Default constructor of Columbia University class");
	}

	// Regular class can not inherit ''unimplemented'' methhods of abstract class
	// Regular class must implement the inherited abstract methods
	// Override solved this by adding unimplemented methods from abstract class MedicalSchool and NursingSchool

	@Override
	public void anatomyLab() {
		// implemented from MedicalSchool abstract class
	}

	@Override
	public void hygiene() {
		// implemented from NursingSchool abstract class
	}
}