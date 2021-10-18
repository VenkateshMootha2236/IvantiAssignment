package ivanti;

public class Pet {

	public static void main(String[] args) {

		Animal myPet;
		Dog myPet1 = new Dog();
		myPet1.setName("tommy");
		myPet1.setDogFurColour("Black");

		System.out.println("Name =" + myPet1.getName());
		System.out.println("Fur Color =" + myPet1.getDogFurColour());
		myPet1.jump();
		myPet1.bark();

		Frog myPet2 = new Frog();
		myPet2.setName("Trod");
		myPet2.setFrogPoisonLevel("High");
		System.out.println("Name =" + myPet2.getName());
		System.out.println("Poison Level =" + myPet2.getFrogPoisonLevel());
		myPet2.jump();
		myPet2.croak();

		myPet = myPet2;

	}

}
