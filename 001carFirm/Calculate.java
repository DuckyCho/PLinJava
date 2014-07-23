package homework02_car_renew;

public class Calculate {
	
	public static int totalProperty(Property p1){
		int result = 0;
		
		for(int i = 0 ; i < p1.PropertyNameList.size(); i++){
			result += p1.PropertyNameList.get(i).getPrice() * p1.PropertyNumList.get(i);
		}
		
		return result;
		
	}

}
