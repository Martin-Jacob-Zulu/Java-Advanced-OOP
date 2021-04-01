package inheritance;

public class Villain extends Hero {

	public Villain(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	// ====================================PUBLIC METHODS==================================
	public void steal() {
		System.out.println(this.name + " is Stealing");
	}

}
