package inheritance;

public class Hero {

	//==============================PRIVATE PROPERTIES=============================
	private int speed;
	private int health;
	private int strength;
	
	//===============================PUBLIC PROPERTIES==============================
	public String name;
	
	// ================================GETTERS=====================================
	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	// =================================CONSTRUCTORS==================================
	public Hero(String name) {
		this.name = name;
		
		generateAbilities();
	}

	// ================================PRIVATE METHODS================================
	private void generateAbilities() {
		// TODO Auto-generated method stub
		
	}
	
	public void fight() {
		
	}
	
	public void run() {
		
	}

	
}
