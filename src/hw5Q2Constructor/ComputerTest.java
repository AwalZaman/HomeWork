package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// default constructor is initialized
		Computer comp01 = new Computer();
		// parameterized constructor is initialized
		Computer mac = new Computer("Apple", "Macbook Air", "MacOS Mojave", 800, 'A', false);
		Computer win = new Computer("HP", "Omen Obelix", "Windows 11", 1200, 'A', false);

	}
}
