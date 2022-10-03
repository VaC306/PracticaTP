package tp1.p1.logic.gameobjects;

public class Sunflower {
	
	private int COST;
	private int ENDURANCE;
	private int DAMAGE;
	private int COOLDOWN;
	private int SUNCOINS;

	
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
