package hw8Q3Abstraction;

public class ColumbiaUniversity {

	// public void chemistry();
	// Resolution: abstract/ declared method not possible in this regular class

	// non abstract/ implemented method
	public void biology() {
		System.out.println("Implemented method biology from Columbia University");
	}

	public ColumbiaUniversity() {
		System.out.println("Default constructor of Columbia University class");
	}
}