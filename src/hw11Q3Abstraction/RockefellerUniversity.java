package hw11Q3Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	// non abstract/ implemented method
	public void maths() {
		System.out.println("Implemented method maths from Rockefeller University");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("Implemented method AeronauticalInfo from AeronauticalSchool");
		
	}

	@Override
	public void mechanicalLab() {
		System.out.println("Implemented method mechanicalLab  from EngineeringSchool");
		
	}
}