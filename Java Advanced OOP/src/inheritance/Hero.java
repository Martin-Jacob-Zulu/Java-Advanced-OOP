package inheritance;

public class Hero extends Entity {

	//==============================PRIVATE PROPERTIES=============================
	protected int speed;
	private int health;
	protected int strength;
	
	//===============================PUBLIC PROPERTIES==============================
	public String name;
	
	// ================================GETTERS=====================================
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
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
		this.strength = (int) (Math.random() * 100 + 1);
		this.speed = (int) (Math.random() * 100 + 1);
		this.health = (int) (Math.random() * 100 + 1);
		
	}
	
	// =============================PUBLIC METHODS===========================
	public void showAbilities() {
		System.out.println("=========================================");
		System.out.println("Strength : " + this.strength);
		System.out.println("Speed : " + this.speed);
		System.out.println("Health : " + this.health);
		System.out.println("=========================================");
	}
	
	public void fight() {
		System.out.println(this.name + " is Fighting");
	}
	
	public void run() {
		System.out.println(this.name + " is Running");
	}

	
}
