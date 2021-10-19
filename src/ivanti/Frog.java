package ivanti;

public class Frog extends Animal implements Croak {

	private String frogPoisonLevel;
	
	//Getter
	public String getFrogPoisonLevel() {
		return frogPoisonLevel;
	}
	
	//Setter
	public void setFrogPoisonLevel(String frogPoisonLevel) {
		this.frogPoisonLevel = frogPoisonLevel;
	}

	@Override
	public void jump() {
		System.out.println("Frog Jump!");

	}

	@Override
	public void croak() {
		System.out.println("Frog Croak!");

	}

}
