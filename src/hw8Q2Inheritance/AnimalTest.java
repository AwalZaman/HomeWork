package hw8Q2Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		System.out.println("\n******************************************************\n");
		Animal animal = new Animal();
		animal.animalInfo();
		// Bird, Mammal, Reptile extends or inherit Aniaml class is an example of Hierarchical Inheritance

		System.out.println("\n******************************************************\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n******************************************************\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo(); // Dog extends Mammal - this is example of 'Single' inheritance
		dog.animalInfo();

		System.out.println("\n******************************************************\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		// Bulldog extends Dog -->> Dog extends Mammal -->> Mammal Extends Animal is an example of 'Multi-level' inheritance

		System.out.println("\n******************************************************\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n******************************************************\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n******************************************************\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n******************************************************\n");
		// Birds is Parent/base/ super class for Robin
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n******************************************************\n");
		// Robin is sub/ child class for Birds
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
	}
}
