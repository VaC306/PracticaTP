package tp1.p1.logic.gameobjects;
import tp1.p1.logic.Game;

public class Sunflower {
	
	public static final int COST = 50;
	private static final int ENDURANCE = 3;
	private static final int DAMAGE = 1;
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
		return true;
	}
	
	public static Object getDescription() {
		
		return null;
	}
	public void update()
	{
		
	}
	public String toString() {	
		
		return "S ["+ this.ENDURANCE + "]";
	}
	
	
	public int recieveDamage()
	{
		
		return 0;
	}
}
