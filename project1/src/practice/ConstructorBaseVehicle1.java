package practice;

public class ConstructorBaseVehicle1 {

	public String color;
	public int numberofWheels;
	public boolean withPowerWindows;
	public boolean withABS;
	public String carType;
	public String clutchType;

//	public static String[] carType = new String[3];
//	public static String[] clutchType = new String[1];
	
//	carType = new String[] {"Sedan", "AUV", "SUV", "Sports Car"};
//	clutchType = new String[] {"Automatic", "Manual"};
	
	
	ConstructorBaseVehicle1(String newColor, int numberOfWheels, String clutchType, boolean withPowerWindows,boolean withABS, String carType) {
		this.color = newColor;
		this.numberofWheels = numberOfWheels;
		this.clutchType = clutchType;
		this.withPowerWindows = withPowerWindows;
		this.withABS = withABS;
		this.carType = carType;
	}
	
	public void setColor (String color) {
		System.out.println("you selected color: " + color);
	}
	
}
