package hw11Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// Regular class use Extends and implements keyword for inheritance in Java
	// Regular Class can inherit other Abstract Class or a regular class by extends keyword
	// Regular Class can't inherit interface by extends keyword
	// Implements keyword is used by regular Class to inherit more than one interface

	// public void chemistry();
	// Resolution: abstract/ declared method not possible in this regular class

	// non abstract/ implemented method
	public void biology() {
		System.out.println("Implemented method biology from Columbia University");
	}

	public ColumbiaUniversity() {
		System.out.println("Default constructor of Columbia University class");
	}

	// static method in Regular class
	public static void columbiaUniversity() {
		System.out.println("Static method of Columbia University class");
	}

	// default method not possible in Regular class
	/*
	 * public default void columbiaUniversityDefault() { 
	 * System.out.println("Default method of Columbia University class"); 
	 * }
	 */

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

	@Override
	public void lawInfo() {
		// implemented from LawSchool interface
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playground() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}
}