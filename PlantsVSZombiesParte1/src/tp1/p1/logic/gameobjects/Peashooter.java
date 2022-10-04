package tp1.p1.logic.gameobjects;

public class Peashooter {
	
	
	public static final int COST = 50;
	private static final int ENDURANCE = 3;
	private static final int DAMAGE = 1;
	private int col;
	private int row;
	private int lives;
	
	public Peashooter(int COST, int ENDURANCE, int DAMAGE) {
		super();
		this.COST = COST;
		this.ENDURANCE = ENDURANCE;
		this.DAMAGE = DAMAGE;
	}
	
	

	public int getCOST() {
		return COST;
	}



	public void setCOST(int cOST) {
		COST = cOST;
	}



	public int getENDURANCE() {
		return ENDURANCE;
	}



	public void setENDURANCE(int eNDURANCE) {
		ENDURANCE = eNDURANCE;
	}



	public int getDAMAGE() {
		return DAMAGE;
	}



	public void setDAMAGE(int dAMAGE) {
		DAMAGE = dAMAGE;
	}

	
	public boolean isAlive()
	{
		
		return ;
	}

	public String toString() {
		
		return "P ["+ this.ENDURANCE + "]";
	}
	
	
	public static Object getDescription() {
		
		return null;
	}
}
