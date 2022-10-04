package tp1.p1.logic.gameobjects;

public class Peashooter {
	
	private int damage;
	private int life;
	private int posX;
	private int posY;
	
<<<<<<< HEAD
	public static final int COST = 50;
	private static final int ENDURANCE = 3; //revisar esto  pepe si
	private static final int DAMAGE = 1;
	private int col;
	private int row;
	private int lives;
	
	public Peashooter(int COST, int ENDURANCE, int DAMAGE) {
=======
	public Peashooter(int damage, int life, int posX, int posY) {
>>>>>>> branch 'master' of https://github.com/VaC306/PracticaTP.git
		super();
		this.damage = damage;
		this.life = life;
		this.posX = posX;
		this.posY = posY;
	}
	
	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String toString() {
		
		return "P ["+ this.life + "]";
	}
	
	
	public static Object getDescription() {
		
		return null;
	}
}
