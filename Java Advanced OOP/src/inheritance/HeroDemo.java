package inheritance;

public class HeroDemo {

	public static void main(String[] args) {
		
		// Instantiate Hero
		Hero bigMan = new Hero("Bif Man");
		bigMan.fight();
		bigMan.run();
		bigMan.showAbilities();
		
		// Instantiate Villain
		Villain slyMan = new Villain("Sly Man");
		slyMan.steal();
		slyMan.fight();
		slyMan.run();
		slyMan.showAbilities();
		
		// Instantiate Vigilante
		Vigilante msSavage = new Vigilante("Ms Savage");
		msSavage.kill();
		msSavage.dealsJustice();
		msSavage.fight();
		msSavage.fight();
		msSavage.showAbilities();
	}

}
