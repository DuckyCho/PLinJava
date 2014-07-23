package game;

public class GameLevel2 extends GameLevel{
	

	private static String level = new String("Level 2");
	private static GameLevel2 l2 = new GameLevel2();
	
	private GameLevel2(){}
	
	public static GameLevel2 getInstance(){
		System.out.println("========level1 end ===========");
		System.out.println();
		System.out.println("========level2 start ===========");
		return l2;
	}
	
	
	@Override
	void simpleAttack() {
		System.out.println(GameLevel2.level+" simple attack : 메롱~메롱~");
	}

	@Override
	void turnAttack() {
		System.out.println(GameLevel2.level+" turn attack : 돌려차기 쓍~~~");
		
	}

	@Override
	void flyingAttack() {
		System.out.println(GameLevel2.level+" flying attack : "+this.unavailable());
		
	}

	

}
