package hw8Q3Abstraction;

public interface University {
	
	public void classSize();

	public abstract void playground(); // interface declared method can may have abstract keyword

	public void teacher();
	
	/*public University(){
		System.out.println("This is from default Constructor of University Class");
	}
	*/
	// Interfaces can not have constructors; so commented out.
}
