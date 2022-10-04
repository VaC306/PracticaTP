package tp1.p1.logic;

import static tp1.p1.view.Messages.error;

import java.util.Random;

import tp1.p1.control.Level;
import tp1.p1.logic.gameobjects.Peashooter;
import tp1.p1.logic.gameobjects.PeashooterList;
import tp1.p1.logic.gameobjects.Sunflower;
import tp1.p1.logic.gameobjects.SunflowerList;
import tp1.p1.logic.gameobjects.Zombie;
import tp1.p1.view.Messages;

public class Game {

	private Long seed;
	private Level level;
	public static final int NUM_COLS = 8 ;
	public static final int NUM_ROWS = 4 ;

	public Game(long seed, Level level) {
		this.seed = seed;
		this.level = level;
		// resetea el juego
	}

	/**
	 * Resets the game.
	 */
	public void reset() {
		/** 
	   inicializa: los contadores y variables true / false
          crea laslistas, incluido el ZombiesManager
	*/

	}

	public boolean isFinished() {
		// true si termia el juego
		return ;
		}

	public boolean isPlayerDied() {
		// true si el jugador muere
		return 	}

	public boolean isPlayerQuits() {
		// true si el jugador decide cerrar
		return }
	
	public void playerQuits() {
		// setter de que el jugador cierra
	}

	/**
	 * Executes the game actions and update the game objects in the board.
	 */
	public void update() {
		// Game Actions
	    //  - puede que ponga un zombie llamando al ZombieManager
	

		// Game object updates
		//   - Llama a los updates de las listas
        // actualiza contadores del juego, ej.: ciclo
	}

	public boolean isPositionEmpty(int col, int row) {
		// true si esa posicion está libre en todas las listas
	}

	private static boolean isPositionInLimits(int col, int row) {
		// true si esa posición está dentro de los límites
	}

	/**
	 * Adds {@link Sunflower} to the game if provided location is empty.
	 * 
	 * @param col column to add the {@link Sunflower}
	 * @param row row to add the {@link Sunflower}
	 * 
	 * @return <code>true</code> if was possible to add a {@link Sunflower} to the
	 *         game, <code>false</code> otherwise.
	 */
	public boolean addSunflower(int col, int row) {
		if (!isPositionEmpty(col, row) || !isPositionInLimits(col, row)) {
			System.out.println(error(Messages.INVALID_POSITION));
			return false;
		}
		
		// si tiene el jugador suficientes monedas crea la planta,
		//  resta monedas y la añade a la lista de su tipo
        // devuelve true si ha ido bien (mejor una sola instrucción return
	}

	private boolean enoughCoins(int cost) {
		return this.suncoins >= cost;
	}

	/**
	 * Adds {@link Peashooter} to the game if provided location is empty.
	 * 
	 * @param col column to add the {@link Peashooter}
	 * @param row row to add the {@link Peashooter}
	 * 
	 * @return <code>true</code> if was possible to add a {@link Peashooter} to the
	 *         game, <code>false</code> otherwise.
	 */
	public boolean addPeashooter(int col, int row) {
		if (!isPositionEmpty(col, row) || !isPositionInLimits(col, row)) {
			System.out.println(error(Messages.INVALID_POSITION));
			return false;
		}
		// si tiene el jugador suficientes monedas crea la planta,
		//  resta monedas y la añade a la lista de su tipo
        // devuelve true si ha ido bien (mejor una sola instrucción return
	
	}

	/**
	 * Adds {@link Zombie} to the game if provided location is empty.
	 * 
	 * @param row column to add the {@link Zombie}
	 * 
	 * @return <code>true</code> if was possible to add a {@link Zombie} to the
	 *         game, <code>false</code> otherwise.
	 */
	public boolean addZombie(int row) {
		return this.zombiesManager.addZombie(row);
	}

	/**
	 * Get game cycles.
	 * 
	 * @return the game cycles
	 */
	public int getCycle() {
		return  // ciclo actual
	}

	/**
	 * Get available suncoins
	 * 
	 * @return the available suncoins
	 */
	public int getSuncoins() {
		return // las monedas que tiene
	}

	public int getRemainingZombies() {
		return this.zombiesManager.getRemainingZombies();
	}

	public void addSunCoins(int suncoins) {
		// suma las monedas al contador
	}

	public String positionToString(int col, int row) {
		  // devuelve representación (string) para el tablero del objeto que haya
		
		Sunflower sunflower = // le pide a la lista el objeto, si lo hay
		if (sunflower != null) {
			return //string del objeto
		}

		Peashooter peashooter = // le pide a la lista el objeto, si lo hay
		if (peashooter != null) {
			return //string del objeto
		}

		Zombie zombie = // le pide a la lista el objeto, si lo hay
		if (zombie != null) {
			return //string del objeto
		}
		return "";
	}

	public boolean allZombiesDied() {
		return // true si ya no quedan zombies
	}

	/**
	 * 
	 * @param col
	 * @param row
	 * @param damage
	 * @return <code>true</code> if a plant has been attacked, <code>false</code> otherwise.
	 */
	public boolean attackPlant(int col, int row, int damage) {
		// true si hay una Sunflower en esa posición + recibirá un daño de damage 
		// true si hay una PeaShooter en esa posición + recibirá un daño de damage 
	
		return false;
	}
	
	private Sunflower getSunflowerInPosition(int col, int row) {
		// devuelve una Sunflower en esa posición

	}

	private Peashooter getPeashooterInPosition(int col, int row) {
		 // devuelve una Peashooter en esa posición

	}

	public boolean attackZombie(int col, int row, int damage) {
	   // igual que attackPlant para zombies
		return false;
	}

	private Zombie getZombieInPosition(int col, int row) {
		// igual que los otros objetos

	}
}
