package oops.composition_Motherboard;

public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution; // This is an Composition class part. Because we taking class Resolution from
											// Resolution class.
											// Resolution class is a part of Class Monitor

	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {

		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixels at " + x + " , " + y + " in color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
