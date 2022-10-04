package tp1.p1.logic.gameobjects;

public class Sunflower {
	
	private int life;
	private int posX;
	private int posY;
	private int damage;
	private int generate = 10;

	
	public Sunflower(int damage, int life, int posX, int posY, int generate) {
		super();
		this.damage = damage;
		this.life = life;
		this.posX = posX;
		this.posY = posY;
		this.generate = generate;
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



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	

	
	public String toString() {
		return "S ["+ this.life + "]";
	}
	
	public static Object getDescription() {
		
		return null;
	}

}
