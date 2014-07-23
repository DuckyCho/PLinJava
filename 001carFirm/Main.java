package homework02_car_renew;

public class Main {

	public static void main(String[] args) {
		Firm f1 = Firm.getFirm();
		
		new Purchase(f1,new Sonata(),3);
		new Purchase(f1,new Grandeur(),2);
		new Purchase(f1,new Genesis(),1);

		System.out.println(Calculate.totalProperty(Firm.getCarProperty())+"만원");
		
	}

}
