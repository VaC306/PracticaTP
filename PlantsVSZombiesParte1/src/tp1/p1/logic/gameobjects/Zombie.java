package tp1.p1.logic.gameobjects;

public class Zombie {
	
	private int ENDURANCE;
	private int DAMAGE;
	private int SPEED;
	
	public Zombie(int ENDURANCE, int DAMAGE, int SPEED) {
		super();
		this.ENDURANCE = ENDURANCE;
		this.DAMAGE = DAMAGE;
		this.SPEED = SPEED;
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



	public int getSPEED() {
		return SPEED;
	}



	public void setSPEED(int sPEED) {
		SPEED = sPEED;
	}



	public String toString() {
		
		return "Z ["+ this.ENDURANCE + "]";
	}

	
}
