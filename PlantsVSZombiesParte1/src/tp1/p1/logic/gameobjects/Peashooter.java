package tp1.p1.logic.gameobjects;

public class Peashooter {
	
	public static final int COST = 50;
	private static final int ENDURANCE = 3; //revisar
	private static final int DAMAGE = 1;
	private int col;
	private int row;
	private int lives;
	
	
	public Peashooter(int COST, int ENDURANCE,int DAMAGE) 
	{
		this.COST = COST;
		this.ENDURANCE = ENDURANCE;
		this.DAMAGE = DAMAGE;
	}
	

	public String toString() {
		
		return "P ["+ this.ENDURANCE + "]";
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
}
