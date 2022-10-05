package tp1.p1.logic.gameobjects;
import tp1.p1.logic.Game;

public class Peashooter {
	
	public static final int COST = 50;
	private static final int ENDURANCE = 3;
	private static final int DAMAGE = 1;
	private Game game;
	private int col;
	private int row;
	private int lives;
	
	
	public Peashooter(int COST, int ENDURANCE,int DAMAGE) 
	{
		
	}
	public boolean isInPosition()
	{
		
		return true;
	}

	public boolean isAlive()
	{
		return true;
	}
	
	public static Object getDescription() {
		
		return null;
	}
	public void update()
	{
		
	}
	public String toString() {	
		
		return "P ["+ this.ENDURANCE + "]";
	}
	
	
	public int recieveDamage()
	{
		
		return 0;
	}
}
