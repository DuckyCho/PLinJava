package studentManagementSystem;

import java.util.ArrayList;

public class Evaluate {

	public static String major;
	public static ArrayList<Score> scoreList;
		
	public static void evaluateStudent (Student s1){
		major = s1.getMajor();
		scoreList = s1.getScoreList();
		Object s;
		
		for(int i =  0 ; i < scoreList.size(); i++){
			
			if(i == Subjectcode.getSubjectcode(major)){
				s = Strategy_major.getInstance();
				scoreList.get(i).setGrade(((Strategy_major) s).getGrade(scoreList.get(i).getScore()));
			}
			else{
				s = Strategy_nonMajor.getInstance();
				scoreList.get(i).setGrade(((Strategy_nonMajor) s).getGrade(scoreList.get(i).getScore()));
			}
						
			
		}
	}
}
