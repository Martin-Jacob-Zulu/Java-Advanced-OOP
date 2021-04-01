package polymorphism;

public class Car extends Vehicle {

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int wheels, float speed, int doors, String color, String make, String model, String year) {
		super(wheels, speed, doors, color, make, model, year);
		// TODO Auto-generated constructor stub
	}

	public Car(float speed, String color, String make, String model, String year) {
		super(speed, color, make, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {

		this.speed += 4;
		
		if (this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}

	}

	@Override
	public void decelerate() {
		this.speed -= 6;
		if ( this.speed <= 0) {
			this.speed = 0;
		}
	}

}
