package hw8Q3Abstraction;

public interface University {

	public void classSize();

	// interface declared method may have abstract keyword
	public abstract void playground();

	public void teacher();

	/*
	 * public University(){ 
	 * System.out.println("This is from default Constructor of University Class"); 
	 * }
	 */
	// Interfaces can not have constructors; so commented out.
}
