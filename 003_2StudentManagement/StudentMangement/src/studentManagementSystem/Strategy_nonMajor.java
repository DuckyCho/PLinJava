package studentManagementSystem;

import java.util.HashMap;

public class Strategy_nonMajor implements IStrategy {
	private static HashMap<Integer,String> scoreMap = new HashMap<Integer,String>();
	private static Strategy_nonMajor sNM = new Strategy_nonMajor();
	
	private Strategy_nonMajor(){
		scoreMap.put(9,"A");
		scoreMap.put(8,"B");
		scoreMap.put(7,"C");
		scoreMap.put(6,"D");
		scoreMap.put(5, "D");
	}
	
	@Override
	public String getGrade(int score) {
		if(score <  55){
			return "F";
		}
		else{
			return Strategy_nonMajor.scoreMap.get(score/10);
		}
	}

	public static Strategy_nonMajor getInstance() {
		return sNM;
	}
	
}
