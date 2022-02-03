package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// default constructor is initialized
		System.out.println("--------------First Outcome------------------");
		Computer computer = new Computer();
		// parameterized constructor is initialized
		System.out.println("\n--------------Second Outcome------------------");
		Computer mac = new Computer("Apple", "Macbook Air", "MacOS Mojave", 800, 'A', false);
		System.out.println("\n--------------Third Outcome------------------");
		Computer win = new Computer("HP", "Omen Obelix", "Windows 11", 1200, 'A', false);
	}
}
