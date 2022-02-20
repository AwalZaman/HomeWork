package hw11Q3Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is method computerLab from EngineeringSchool abstract class");
	}
}
