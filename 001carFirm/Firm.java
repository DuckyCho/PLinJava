package homework02_car_renew;

public class Firm {

	private static Firm f1 = new Firm();
	private static Property carProperty = new Property();
	
	public static Firm getFirm(){
		return Firm.f1;
	}
	
	public static Property getCarProperty(){
		return Firm.carProperty;
	}
	
}
