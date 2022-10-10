package tp1.p1.logic.gameobjects;
import tp1.p1.logic.Game;
import tp1.p1.view.Messages;

public class Sunflower {

	//declaraci�n de constantes de clase (ver el D.Clases en PRAC1-ayudas.pdf)
	//declaraci�n de atributos (ver el D.Clases en PRAC1-ayudas.pdf)
	public static final int COST = 50;
	private static final int ENDURANCE = 1;
	private static final int DAMAGE = 0;
	private static final int COOLDOWN = 2;
	private static final int SUNCOINS = 1; //revisar valores
	private Game game;
	private int col;
	private int row;
	private int lives;
	private int cooldownCycles;
	
	public Sunflower(Game game, int col, int row, int lives, int cooldownCycles) {
		//constructor del objeto
		this.game = game;
		this.col = col;
		this.row = row;
		this.lives = lives;
		this.cooldownCycles = cooldownCycles;
	}

	public boolean isInPosition(int col, int row) {
	   // true si este Peashooter est� en esa posici�n
		if(this.col == col && this.row == row) return true;
		else return false;
	}

	public boolean isAlive() {
	    // true si le queda alguna vida en el contador de vidas
		if(lives > 0) return true;
		return false;
	}

	public static String getDescription() {
		return Messages.SUNFLOWER_DESCRIPTION.formatted(COST, DAMAGE, ENDURANCE);
	}

	public void update() {
		// si est� vivo , si encuentra alg�n zombie en misma fila 
		// le pide al Game que lo ataque
		if(isAlive())
		{
			
		}
		else
		{
			// game le ataca
		}
	}

	public String toString() {
	// si est� vivo devuelve el mensaje PEASHOOTER_ICON formateado con sus vidas
		if(isAlive())
		{
			return "S ["+ this.lives + "]";
		} 
		else 
		{
			return "";
		}
	}

	public void receiveDamage(int damage) {
		// le resta a las vidas el da�o causado
		lives -= damage;

	}
}