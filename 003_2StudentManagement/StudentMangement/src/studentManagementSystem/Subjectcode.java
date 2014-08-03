package studentManagementSystem;

import java.util.HashMap;

public class Subjectcode {
	
	private static Subjectcode s1 = new Subjectcode();
	private HashMap<String,Integer> subjectCode = new HashMap<String,Integer>();
	
	private Subjectcode(){
		s1.subjectCode.put("math",0);
		s1.subjectCode.put("english",1);
	}
	
	public static int getSubjectcode(String subject){
		return s1.subjectCode.get(subject);
	}
}
