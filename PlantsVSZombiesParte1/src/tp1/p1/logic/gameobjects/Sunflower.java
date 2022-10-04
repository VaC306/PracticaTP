package tp1.p1.logic.gameobjects;
import tp1.p1.logic.Game;

public class Sunflower {
	
	public static final int COST = 20;
	private static final int ENDURANCE = 1;
	private static final int DAMAGE = 0;
	private static final int COOLDOWN;
	private static final int SUNCOINS;
	
	private Game game;

	
	public Sunflower(int COST, int ENDURANCE, int DAMAGE, int COOLDOWN, int SUNCOINS) {
		super();
		this.COST = COST;
		this.ENDURANCE = ENDURANCE;
		this.DAMAGE = DAMAGE;
		this.COOLDOWN = COOLDOWN;
		this.SUNCOINS = SUNCOINS;
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


	public int getCOOLDOWN() {
		return COOLDOWN;
	}


	public void setCOOLDOWN(int cOOLDOWN) {
		COOLDOWN = cOOLDOWN;
	}


	public int getSUNCOINS() {
		return SUNCOINS;
	}


	public void setSUNCOINS(int sUNCOINS) {
		SUNCOINS = sUNCOINS;
	}

	
	
	public String toString() {
		return "S ["+ this.ENDURANCE + "]";
	}
	
	public static Object getDescription() {
		
		return null;
	}

}
