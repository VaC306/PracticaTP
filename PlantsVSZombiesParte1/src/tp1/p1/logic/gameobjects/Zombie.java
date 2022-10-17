package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Zombie {
	
	
	private Game game;
	private int life;
	private int row;
	private int col;
	private int nextStepCycles=1;
	
	private static final int ENDURANCE = 5; //revisar esto  pepe si
	private static final int DAMAGE = 1; // donde se puede utilizar? preguntar jueves
	private static final int SPEED = 1;
	
	public Zombie(Game game,int col, int row) {
		super();
		this.game = game;
		this.col = col;
		this.row = row;
		this.life = ENDURANCE;
		//this.nextStepCycles = nextStepCycles;
	}
	

	public int getrow() {
		return row;
	}

	public int getcol() {
		return col;
	}

	public String toString() {
		
		return "Z ["+ this.life + "]";
	}
	
	public void receiveDamage() {
		this.life--;
	}
	
	public boolean isAlive() {
		if(this.life > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isInPosition(int x, int y) {
		if(isAlive() && this.row == x && this.col == y) {
			return true;
		}else {
			return false;
		}
	}
	
	//preguntar si isArrived se refiere a llegar a final del tablero
	public boolean isArrived() {
		if(this.col == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void update() {
		if(isAlive()) {
			
			if(!game.attackPlant(this.col -1, this.row, DAMAGE)) {
				if(nextStepCycles<= 0) {
					row--;
					nextStepCycles= 1;
				}else {
					nextStepCycles--;
				}				
			}	
		}
		
	}

	
}