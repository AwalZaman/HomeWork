package hw11Q3Abstraction;

public interface University extends College, Hospital {

	/*
	 * Extends keyword is used for the inheritance in Interface. An Interface can inherit more than one Interface by extends keyword but can't inherit a regular class or an
	 * abstract class by extends keyword. More than one inheritance is possible for interface
	 */

	public void classSize();

	public abstract void playground();

	public void teacher();

	// default method inside interface from java 1.8
	public default void gymnasium() {
		System.out.println("University's Gymnasium");
	}

	// static method inside interface from java 1.8
	public static void library() {
		System.out.println("University's Library");
	}
}
