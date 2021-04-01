/**
 * 
 */
package polymorphism;

/**
 * @author Martrin Jacob Zulu
 * @version : 0.13
 *
 */
public class Main {

	/**
	 * Main Method for the project
	 * @param args
	 */
	public static void main(String[] args) {

		Vehicle benz = new Car(4, 0, 2, "Silver", "Benz", "BN206", "2006");
		Truck daff = new Truck(8, 8, 4, "Grey", "Daff", "D140", "2017");
		
		for (int seconds = 0; seconds < 15; seconds ++) {
			benz.accelerate();
			daff.accelerate();
		}
		System.out.println("Benz Speed : " + benz.getSpeed() + "\nDAFF Speed : " + daff.getSpeed());
	}

}
