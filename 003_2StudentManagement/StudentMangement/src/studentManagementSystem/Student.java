package studentManagementSystem;

public class Student {

	private String name;
	private int id;
	private static int idConstructor = 141213;
	private String major;
	private Score engScore;
	private Score mathScore;
		
	public Student(String name,String major, int mathScore, int engScore){
		this.id = idConstructor;
		idConstructor++;
		this.name = name;
		this.engScore = new Score(engScore);
		this.mathScore = new Score(mathScore);
		this.major = major;
	}
	
	
}
