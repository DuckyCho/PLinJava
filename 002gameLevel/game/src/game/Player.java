package game;

public class Player {
	
	public String name;
	public GameLevel playerLevel;
	
	public Player(){
		this.name="Unnamed";
		this.playerLevel = GameLevel1.getInstance();}
	
	public Player(String name){
		this.name=name;
		this.playerLevel = GameLevel1.getInstance();}

	public void upgradeLevel(){
		this.playerLevel = this.playerLevel.upgradeLevel();
		
	}
	
	public GameLevel getGameLevel(){
		return this.playerLevel;
	}
	
	public void attack(){
		this.playerLevel.play();
	}
	
	
	
}
