package tp1.p1.logic.gameobjects;

public class Zombie {
	
	private int damage;
	private int life;
	private int posX;
	private int posY;
	
	public Zombie(int damage, int life, int posX, int posY) {
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
		
		return "Z ["+ this.life + "]";
	}

	
}
