package hw8Q3Abstraction;

public abstract class MedicalSchool {

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
