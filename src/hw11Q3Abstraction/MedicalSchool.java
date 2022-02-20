package hw11Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	// Extends and implements keyword is used by Abstract class for the inheritance in Java
	// Abstract class can inherit only one abstract class or one regular class by extends keyword
	// Extends keyword is not used to inherit interface by abstract class
	// Implements keyword is used by Abstract Class to inherit more than one interface

	// method declared/defined/abstract method
	public abstract void anatomyLab();

	// method implemented/ non-abstract method
	public void biochemistryLab() {
		System.out.println("BiochemistryLab method of abstract class Medical School");
	}

	// static method
	public static void medicalSchool() {
		System.out.println("Static method of abstract class Medical School");
	}

	// default method not possible in Abstract class
	/*
	 * public default void medicalSchoolDefault() { 
	 * System.out.println("Default method of abstract class Medical School"); 
	 * }
	 */

	// default constructor created for abstract class
	public MedicalSchool() {
		System.out.println("Default constructor from Medical School");
	}
}
