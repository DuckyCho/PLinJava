package homework02_car_renew;


public class Car extends Property {
	public String name;
	public int price;
	
	{this.setName();
	this.setPrice();
	}
	
	
	public void setName(){
		this.name = "이름없음";
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setPrice(){
		this.price = 0;
	}
	
	public int getPrice(){
		return this.price;
	}

}
