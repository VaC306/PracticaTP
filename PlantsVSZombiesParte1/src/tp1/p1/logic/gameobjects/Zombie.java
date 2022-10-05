package tp1.p1.logic.gameobjects;
import tp1.p1.logic.Game;

public class Zombie {
	
	public static final int ENDURANCE = 5;
	private static final int DAMAGE = 1;
	private static final int SPEED = 1;
	private Game game;
	private int col;
	private int row;
	private int lives;
	private int nextStepCycles;
	
	
	public Zombie(int ENDURANCE, int DAMAGE,int SPEED) 
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
	public boolean isArrived()
	{
		return true;
	}
	
	public void update()
	{
		
	}
	public String toString() {	
		
		return "Z ["+ this.ENDURANCE + "]";
	}
	
	
	public int recieveDamage()
	{
		
		return 0;
	}
}
