package homework02_car_renew;

public class Purchase {

	public Purchase(Firm f1, Car c1){
		for ( int i = 0 ; i <= Firm.getCarProperty().PropertyNameList.size(); i++){
			if(i == Firm.getCarProperty().PropertyNameList.size()){
				Firm.getCarProperty().PropertyNameList.add(c1);
				Firm.getCarProperty().PropertyNumList.add(1);
				break;
			}
			
			else if (Firm.getCarProperty().PropertyNameList.get(i).getName() == c1.name ){
				Firm.getCarProperty().PropertyNumList.set(i,Firm.getCarProperty().PropertyNumList.get(i)+1);
				break;
			}
			
			else{
				continue;
			}
		}
	}
	
	public Purchase(Firm f1, Car c1, int num){
		for ( int i = 0 ; i <= Firm.getCarProperty().PropertyNameList.size(); i++){
			if(i == Firm.getCarProperty().PropertyNameList.size()){
				Firm.getCarProperty().PropertyNameList.add(c1);
				Firm.getCarProperty().PropertyNumList.add(num);
				break;
			}
			
			else if (Firm.getCarProperty().PropertyNameList.get(i).getName() == c1.name ){
				Firm.getCarProperty().PropertyNumList.set(i,Firm.getCarProperty().PropertyNumList.get(i)+num);
				break;
			}
			
			else{
				continue;
			}
		}
	}
}
