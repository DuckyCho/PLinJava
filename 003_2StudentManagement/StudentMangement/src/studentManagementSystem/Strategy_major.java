package studentManagementSystem;

import java.util.HashMap;

public class Strategy_major implements IStrategy {
	
	private static HashMap<Integer,String> scoreMap = new HashMap<Integer,String>();
	private static Strategy_major sM = new Strategy_major();
	
	
	
	private Strategy_major(){
		scoreMap.put(9,"A");
		scoreMap.put(8,"B");
		scoreMap.put(7,"C");
		scoreMap.put(6,"D");
		scoreMap.put(5,"F");
	}
	
	
	
	@Override
	public String getGrade(int score) {
		if(score >=  95){
			return "S";
		}
		else{
			return Strategy_major.scoreMap.get(score/10);
		}
	}


	public static Strategy_major getInstance() {
		return sM;
	}
	
	
}
