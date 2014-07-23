package birthday;

import java.util.HashMap;

public class BirthDay {
	
	int Year;
	int Month;
	int Day;
	boolean leapYear;
	boolean validate = false;
	
	public BirthDay(){
		
	}
	
	public BirthDay(int Year, int Month, int Day){
		this.setDate(Year, Month, Day);
	}
	
	public void setDate(int Year, int Month, int Day){
		this.setYear(Year);
		this.setMonth(Month);
		this.setDay(Day);
	}
	
	public void setYear(int Year){
		this.Year = Year;
		this.leapYearCheck(this.Year);
	}
	
	public void setMonth(int Month){
		this.Month = Month;
		checkMonthValidate(this.Month);
	}
	
	public void setDay(int Day){
		this.Day = Day;
		checkDayValidate(this.Month,this.Day);
	}
	
	
	public void checkMonthValidate(int Month){
		if( this.Month <= 13 && this.Month >= 1)
			this.validate = true;
		else
			this.validate = false;
	}
	
	public void checkDayValidate(int Month, int Day){
		if( Day <= maxDayInMonth(Month) && Day >= 1)
			this.validate = true;
		else
			this.validate = false;
	}
	
	
	public Integer maxDayInMonth(int Month){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1,31);
		map.put(2,leapYear ? 29 : 28);
		map.put(3,31);
		map.put(4,30);
		map.put(5,31);
		map.put(6,30);
		map.put(7,31);
		map.put(8,31);
		map.put(9,30);
		map.put(10,31);
		map.put(11,30);
		map.put(12,31);
		if(Month >= 1 && Month <= 12)
			return map.get(Month);
		else
			return -1;
	}
	
	public void leapYearCheck(int Year){
		if (Year%4 == 0 )
			if(Year%100 == 0)
				if(Year%400 == 0)
					this.leapYear = true;
				else
					this.leapYear = false;
			else
				this.leapYear = true;
		
		else
			this.leapYear=false;
	}
	
	
	public boolean checkValidate(){
		
		return this.validate;
	}
}
