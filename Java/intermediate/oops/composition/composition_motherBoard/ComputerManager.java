/**
 * 
 */
package oops.composition_Motherboard;

/**
 * @author shreyas
 *
 */
public class ComputerManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(20, 20, 50); 
		Case theCase = new Case("Pavilion", "HP", "240", dimensions);
		
	//  Monitor theMonitor = new Monitor("15.2 inch Beast", "HP", "15.2", nativeResolution); // Hence we have to create Resolution Object in main. Instead of this we can do in brackets only by crating new. 
		Monitor theMonitor = new Monitor("15.2 inch Beast", "HP", 15, new Resolution(2540, 1440)); // Hence we dont need to create 1 Resolution class and object.
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.poweUp();  // Composition is creating objects within objects so having like master objects.
		
//		thePC.getMonitor().drawPixelAt(1500, 1200, "red"); //We are accessing this draw method from monitor to PC class.
//		thePC.getTheCase().pressPowerButton(); ////We are accessing pressPower method from Case class to PC. 
//		thePC.getMotherboard().loadProgram("MX Linux"); //We are accessing the loadProgram() method from Motherboard class to PC.
		
		
	}

}
