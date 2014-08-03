package studentManagementSystem;

import java.util.HashMap;

public class Subjectcode {
	
	private HashMap<String,Integer> subjectCode = new HashMap<String,Integer>();
	private static Subjectcode s1 = new Subjectcode();
	
	
	private Subjectcode(){
		this.subjectCode.put("math",0);
		this.subjectCode.put("english",1);
	}
	
	public static int getSubjectcode(String subject){
		return s1.subjectCode.get(subject);
	}
	
}
