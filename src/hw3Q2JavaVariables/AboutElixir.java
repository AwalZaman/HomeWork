package hw3Q2JavaVariables;

public class AboutElixir {
	// declared variable
	public int elixir;
	// initialized variable; String is not a pure primitive data type
	public String name = "Awal Zaman";
	public String surname = " Elixir";
	// initialized byte is 1 byte
	public byte age = 127;
	// initialized short is 2 byte
	public short rent = 32767;
	// initialized int is 4 byte
	public int salary = 2147483647;
	// initialized long is 8 byte; use l at end
	public long bankBalance = 123456789012345l;
	// initialized float is 4 byte; use f at end
	public float myHeight = 3.14f;
	// initialized double is 8 byte
	public double myGrade = 3.678376676783;
	// initialized boolean is 1 bit; true/false
	public boolean usCitizen = false;
	// initialized char is 2 byte; single character or ASCII values
	public char sex = 'M';

	public static void main(String[] args) {
		/*
		 * Here instantiation class object = new constructor(); 
		 * aboutElixir is being a category under class AboutMe
		 */
		AboutElixir aboutElixir = new AboutElixir();
		// String concat done only with strings here
		// testing 02
		System.out.println(aboutElixir.name.concat(aboutElixir.surname));
		System.out.println("Sex: " + aboutElixir.sex);
		System.out.println("Age: " + aboutElixir.age);
		System.out.println("House Rent: " + aboutElixir.rent);
		System.out.println("Salary: " + aboutElixir.salary);
		System.out.println("Deposit: " + aboutElixir.bankBalance);
		System.out.println("Height: " + aboutElixir.myHeight);
		System.out.println("GPA: " + aboutElixir.myGrade);
		System.out.println("Does have US Citizenship? : " + aboutElixir.usCitizen);
	}
/*interesting - https://www.linkedin.com/learning/learning-java-8/instantiating-classes 
 * here 
 */
}
