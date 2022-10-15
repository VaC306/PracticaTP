package tp1.p1.logic;

import java.util.Random;

import tp1.p1.control.Level;
import tp1.p1.logic.gameobjects.Zombie;
import tp1.p1.logic.gameobjects.ZombieList;

/**
 * Manage zombies in the game.
 *
 */
public class ZombiesManager {

	private Game game;

	private Level level;

	private Random rand;

	private int remainingZombies;
	
	private ZombieList zombies;

	public ZombiesManager(Game game, Level level, Random rand) {
		this.game = game;
		this.level = level;
		this.rand = rand;
		this.remainingZombies = level.getNumberOfZombies();
		this.zombies = new ZombieList(this.remainingZombies);
	}

	/**
	 * Checks if the game should add (if possible) a zombie to the game.
	 * 
	 * @return <code>true</code> if a zombie should be added to the game.
	 */
	private boolean shouldAddZombie() {
		return rand.nextDouble() < level.getZombieFrequency();
	}
	
	/**
	 * Return a random row within the board limits.
	 * 
	 * @return a random row.
	 */
	private int randomZombieRow() {
		return rand.nextInt(Game.NUM_ROWS);
	}
	
	public boolean addZombie() {
		int row = randomZombieRow();
		return addZombie(row);
	}

	public boolean addZombie(int row) {
		boolean canAdd = getRemainingZombies() > 0 && shouldAddZombie()
				&& isPositionEmpty(Game.NUM_COLS, row);

		if(canAdd) {
			
			Zombie zombie = new Zombie(game,Game.NUM_COLS,row);
			zombies.add(zombie);
			// TODO fill your code
		}
		return canAdd;
	}
	
	public int getRemainingZombies() {
		return remainingZombies;
	}
	
	public boolean isPositionEmpty(int col, int row) {
		if(zombies.isPositionEmpty(col, row)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean AllZombiesDied() {
		if(!zombies.ZombieAlived()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean zombieArrived() {
		if(!zombies.ZombieArrived()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Zombie getZombieInPosition(int col,int row) {
		return zombies.getZombieInPosition(col, row);
	}

	public void Update() {
		
			
		
	}
	
	// TODO fill your code
}