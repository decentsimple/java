package practice;

public class ConstructorPageVehicle1{
	

	public static void main(String[] args) {
		ConstructorBaseVehicle1 base = new ConstructorBaseVehicle1("Yellow", 4, "Automatic", true, false, "Sedan");
		base.setColor("White");
		System.out.println(base.color);
		
	}

}
