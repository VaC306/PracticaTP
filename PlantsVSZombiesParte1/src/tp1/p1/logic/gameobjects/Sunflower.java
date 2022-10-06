package tp1.p1.logic.gameobjects;
import tp1.p1.logic.Game;

public class Sunflower {
	
	public static final int COST = 50;
	private static final int ENDURANCE = 1;
	private static final int DAMAGE = 0;
	private static final int COOLDOWN = 2;
	private static final int SUNCOINS = 1; //revisar valores
	private Game game;
	private int col;
	private int row;
	private int lives;
	private int cooldownCycles;
	
	
	public Sunflower (int COST, int ENDURANCE,int DAMAGE, int COOLDOWN, int SUNCOINS) 
	{
		
	}
	public boolean isInPosition()
	{
		return true;
	}

	public boolean isAlive()
	{
		if(lives > 0) return true;
		return false;
	}
	
	public static Object getDescription() {
		
		return null;
	}
	public void update()
	{
		
	}
	public String toString() {	
		
		return "S ["+ Sunflower.ENDURANCE + "]";
	}
	
	
	public void recieveDamage()
	{
		lives--;
	}
}
