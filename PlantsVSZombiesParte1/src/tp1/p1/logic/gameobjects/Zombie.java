package tp1.p1.logic.gameobjects;

public class Zombie {
	
	private static final int ENDURANCE = 5;
	private static final int DAMAGE = 1;
	private static final int SPEED;
	
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
5


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
