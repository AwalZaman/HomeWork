package hw10Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("----- Default constructor initialized for Daughter Class -----");
		Daughter daughter = new Daughter();

		System.out.println("\n\n----- Parameterized constructor initialized for Daughter Class -----");
		Daughter daughter02 = new Daughter("September", 16);

		System.out.println("\n\n----- Default Method initialized for Daughter Class -----");
		daughter.daughter();

		System.out.println("\n\n----- Parameterized Method initialized for Daughter Class -----");
		daughter.daughterInfo("September", 16);

		System.out.println("\n\n----- Default constructor initialized for Father Class -----");
		Father father = new Father();

		System.out.println("\n\n----- Parameterized constructor initialized for Father Class -----");
		Father father02 = new Father("Mike", 40, 'M', false);

		System.out.println("\n\n----- Default method initialized for Father Class -----");
		father02.father();
		
		System.out.println("\n\n----- Parameterized method initialized for Father Class -----");
		father.fatherInfo("Ron", 60, 'M', true);
	}
}
