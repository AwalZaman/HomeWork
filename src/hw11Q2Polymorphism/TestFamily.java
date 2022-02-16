package hw11Q2Polymorphism;

public class TestFamily {
	
	public static void main(String[] args) {
		System.out.println("\n------------------- Sister ---------------------\n");
		Sister sis = new Sister();
		sis.sister();
		sis.sister(7);
		sis.sister(3, 7);
		sis.sister(4, 5, 6);
		sis.sister("2", 9);
		Sister.sister(8, "7"); //static method called by sister Class itself
		sis.sister(1, 2, 5, 9);
		sis.sister("4");
		
		System.out.println("\n------------------- Niece ---------------------\n");
		Niece nc = new Niece();
		nc.sister();
		nc.sister(7);
		nc.sister(3, 7);
		nc.sister(4, 5, 6);
		nc.sister("2", 9);
		// static method can't be overriden in child class Niece
		//final method can't be overriden in child class Niece
		nc.sister("4");
	}
}