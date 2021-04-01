/**
 * 
 */
package polymorphism;

/**
 * @author Martrin Jacob Zulu
 *
 */
public class Truck extends Vehicle {

	/**
	 * @param wheels
	 * @param speed
	 * @param doors
	 * @param color
	 * @param make
	 * @param model
	 * @param year
	 */
	
	// Constructor
	public Truck(int wheels, float speed, int doors, String color, String make, String model, String year) {
		super(wheels, speed, doors, color, make, model, year);
		// TODO Auto-generated constructor stub
		
		checkNumDoors();
	}
	
	
	//Private Methods
	private void checkNumDoors() {
		if (this.numDoors < 3) {
			this.numDoors = 3;
		}
	}

	// Overidden Public Methods
	
	@Override
	public void accelerate() {
		this.speed += 2;
		if (this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}
	
	@Override
	public void decelerate() {
		this.speed -= 3;
		if (this.speed <= 0) {
			this.speed = 0;
		}
	}
}
