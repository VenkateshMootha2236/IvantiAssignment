package ivanti;

public class Dog extends Animal implements Bark {

	private String dogFurColour;
	
	//Getter
	public String getDogFurColour() {
		return dogFurColour;
	}
	
	//Setter
	public void setDogFurColour(String dogFurColour) {
		this.dogFurColour = dogFurColour;
	}

	@Override
	public void jump() {
		System.out.println("Dog Jump!");

	}

	@Override
	public void bark() {
		System.out.println("Dog Bark!");

	}

}
