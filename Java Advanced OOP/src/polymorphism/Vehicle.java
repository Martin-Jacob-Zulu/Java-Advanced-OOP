package polymorphism;

public abstract class Vehicle {

	// Properties
	
	protected int runWheels = 4;
	protected int numDoors = 2;
	protected String color = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	final int MAX_SPEED = 260;
	
	// Getters
	
	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return this.speed;
	}

	// Constructors
	public Vehicle() {
		
	}
	
	public Vehicle(int wheels, float speed, int doors, String color, String make, String model, String year) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.speed = speed;
		this.year = year;
		this.numDoors = doors;
		this.runWheels = wheels;
	}
	
	public Vehicle(float speed, String color, String make, String model, String year) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.speed = speed;
		this.year = year;
	}

	public abstract void  accelerate();
	
//	public abstract void  accelerate(){
//		this.speed += 4;
//		if (this.speed >= this.MAX_SPEED) {
//			this.speed = this.MAX_SPEED;
//		}
//	}
	
	public abstract void decelerate();
	
//	public abstract void decelerate() {
//		this.speed -= 6;
//		if (this.speed <= 0) {
//			this.speed = 0;
//		}
//	}
	
	public void turnLeft() {
		System.out.println("Turning Left");
	}
	
	public void turnRight() {
		System.out.println("Turning Right");
	}
}
