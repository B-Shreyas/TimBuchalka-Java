/**
 * 
 */
package oops.composition_Motherboard;

/**
 * @author shreyas
 *
 */
public class Case {

	private String model;
	private String manuFacturer;
	private String powerSupply;
	private Dimensions dimensions;

	public Case(String model, String manuFacturer, String powerSupply, Dimensions dimensions) {
		this.model = model;
		this.manuFacturer = manuFacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");  // This is an Composition class part. Because we taking class Case from Case class.
													// Case class is a part of Class Dimensions
	}
	public String getModel() {
		return model;
	}

	public String getManuFacturer() {
		return manuFacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

}
