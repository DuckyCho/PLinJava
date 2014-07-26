package game;

public abstract class GameLevel {

	public void GameLeve(){}
		
	abstract void simpleAttack();
	abstract void turnAttack();
	abstract void flyingAttack();
	abstract GameLevel upgradeLevel();
	
	public String unavailable(){
		return "불가능";
	}
	
	
	public final void play(){
		simpleAttack();
		turnAttack();
		flyingAttack();
	}
	
}
