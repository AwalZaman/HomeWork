package hw9Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	
	// Extends keyword is used for the inheritance in Java for Abstract Class
	// Abstract Class can inherit other Abstract Class or a regular class by extends keyword
	// Abstract Class can't inherit interface by extends keyword
	// Only one inheritance is possible by an Abstract Class
	
	// method declared/defined/abstract method
	public abstract void anatomyLab();

	// method implemented/ non-abstract method
	public void biochemistryLab() {
		System.out.println("In abstract class its mandatory to use abstract keyword in abstract method");
	}

	// default constructor created for abstract class
	public MedicalSchool() {
		System.out.println("Default constructor from Medical School");
	}
}
