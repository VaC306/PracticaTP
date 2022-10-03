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
	
	
	
	public String toString() {
		
		return "Z ["+ this.ENDURANCE + "]";
	}

	
}
