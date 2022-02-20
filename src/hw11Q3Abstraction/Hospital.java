package hw11Q3Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();
	
	public default void morgue() {
		System.out.println("Hospital's Morgue");
	}

	public static void pharmacy() {
		System.out.println("Hospital's Pharmacy");
	}
}
