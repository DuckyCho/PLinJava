package studentManagementSystem;

public class Score {

	
	private int score;
	private String grade;
	
	
	public Score(int score){
		this.score = score;
	}
		
	public void setScore(int score){
		this.score = score;
	}
	
	public int getScore(){
		return this.score;
	}
	
	public void setGrade(String grade){
		this.grade = grade;
	}
	
	public String getGrade(){
		return this.grade;
	}
}
