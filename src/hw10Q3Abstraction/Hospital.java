package hw10Q3Abstraction;

public interface Hospital {

	public void vocationalInfo();

	public default void morgue() {
		System.out.println("Hospital's Morgue");
	}

	public static void phramacy() {
		System.out.println("Hospital's Pharmacy");
	}
}
