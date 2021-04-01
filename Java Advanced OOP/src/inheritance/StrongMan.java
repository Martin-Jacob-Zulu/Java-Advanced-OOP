package inheritance;

public class StrongMan extends Hero {

	public StrongMan(String name) {
		super(name);
		this.boostStrength();
	}

	// ==================================PRIVATE METHODS==================================
		private void boostStrength() {
			this.strength += 50;
			if (this.strength > 100) {
				this.strength = 100;
			}
		}
		
}
