package game;

public abstract class GameLevel {

	
	abstract void simpleAttack();
	abstract void turnAttack();
	abstract void flyingAttack();

	public String unavailable(){
		return "불가능";
	}
	
	
	public final void play(){
		simpleAttack();
		turnAttack();
		flyingAttack();
	}
	
}
