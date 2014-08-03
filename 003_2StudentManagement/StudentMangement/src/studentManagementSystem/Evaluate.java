package studentManagementSystem;

import java.util.ArrayList;

public class Evaluate {

	public static String major;
	public static ArrayList<Score> scoreList;
		
	public static void evaluateStudent (Student s1){
		major = s1.getMajor();
		scoreList = s1.getScoreList();
		IStrategy s;
		String grade;
		
		for(int i =  0 ; i < scoreList.size(); i++){
			
			if(i == Subjectcode.getSubjectcode(major)){
				s = Strategy_major.getInstance();
				grade = s.getGrade(scoreList.get(i).getScore());
				scoreList.get(i).setGrade(grade);
			}
			
			else{
				s = Strategy_nonMajor.getInstance();
				grade = s.getGrade(scoreList.get(i).getScore());
				scoreList.get(i).setGrade(grade);
			}
			
						
			
		}
	}
}
