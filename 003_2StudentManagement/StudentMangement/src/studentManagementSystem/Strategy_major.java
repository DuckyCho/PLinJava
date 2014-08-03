package studentManagementSystem;

import java.util.HashMap;

public class Strategy_major implements IStrategy {
	
	private static Strategy_major sM = new Strategy_major();
	private HashMap<Integer,String> scoreMap = new HashMap<Integer,String>();
	private Strategy_major(){
		sM.scoreMap.put(9,"A");
		sM.scoreMap.put(8,"B");
		sM.scoreMap.put(7,"C");
		sM.scoreMap.put(6,"D");
		sM.scoreMap.put(5,"F");
	}
	
	
	
	@Override
	public String getGrade(int score) {
		if(score >=  95){
			return "S";
		}
		else{
			return sM.scoreMap.get(score/10);
		}
	}


	public static Strategy_major getInstance() {
		return sM;
	}
	
	
}
