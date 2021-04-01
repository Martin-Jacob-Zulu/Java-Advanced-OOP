package inheritance;

public class Vigilante extends Villain {

	public Vigilante(String name) {
		super(name);
	}
	
	
	//==================================PUBLIC METHODS================================
	public void dealsJustice() {
		System.out.println(this.name + " is dealing Justice");
	}

}
