package hw8Q2Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		System.out.println("\n************************** Animal ****************************\n");
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n--> Bird, Mammal, Reptile are Hierarchical Inheritance form Animal");

		System.out.println("\n************************** Mammals **************************\n");
		System.out.println("--> Single Inheritance: Mammal > Animal \n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n### Dog > Mammal > Animal \n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo(); // Dog extends Mammal - this is called 'Single' inheritance
		dog.animalInfo();

		System.out.println("\n--> Multi-level Inheritance: BullDog > Dog > Mammal > Animal \n");
		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo(); // Bulldog extends Dog -->> Dog extends Mammal -->> Mammal Extends Animal this
								// is called 'Multi-level' inheritance

		System.out.println("\n************************** Reptile ****************************\n");
		System.out.println("## Reptile -->> Animal \n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n### Snake > Reptile > Animal \n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n--> Multi-level Inheritance: Cobra > Snake > Reptile > Animal \n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n************************* BIRDS ************************\n");
		System.out.println("\n---------------- \"Birds\" is Parent/base/ super class for Robin ---------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n---------------- \"Robin\" is sub/ child class for Birds ------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
	}
}
