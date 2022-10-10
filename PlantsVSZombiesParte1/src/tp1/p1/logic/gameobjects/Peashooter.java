package tp1.p1.logic.gameobjects;
import tp1.p1.logic.Game;
import tp1.p1.view.Messages;

public class Peashooter {

	//declaraciï¿½n de constantes de clase (ver el D.Clases en PRAC1-ayudas.pdf)
	//declaraciï¿½n de atributos (ver el D.Clases en PRAC1-ayudas.pdf)
	public static final int COST = 50;
	private static final int ENDURANCE = 3;
	private static final int DAMAGE = 1;
	private Game game;
	private int col;
	private int row;
	private int lives;
	
	public Peashooter(Game game, int col, int row) {
		//constructor del objeto
		this.game = game;
		this.col = col;
		this.row = row;
		this.lives = lives;
	}

	public boolean isInPosition(int coln, int rown) {
	   // true si este Peashooter esta en esa posiciïo½n
		if(this.col == coln && this.row == rown) return true;
		else return false;
	}

	public boolean isAlive() {
	    // true si le queda alguna vida en el contador de vidas
		if(lives > 0) return true;
		return false;
	}

	public static String getDescription() {
		return Messages.PEASHOOTER_DESCRIPTION.formatted(COST, DAMAGE, ENDURANCE);
	}

	public void update() {
		// si estï¿½ vivo , si encuentra algï¿½n zombie en misma fila 
		// le pide al Game que lo ataque
		if(isAlive())
		{
			//buscar zombie
		}
		else
		{
			// game le ataca
		}
	}

	public String toString() {
	// si estï¿½ vivo devuelve el mensaje PEASHOOTER_ICON formateado con sus vidas
		if(isAlive())
		{
			return "P ["+ this.lives + "]";
		} 
		else 
		{
			return "";
		}
	}

	public void receiveDamage(int damage) {
		// le resta a las vidas el daï¿½o causado
		lives -= damage;

	}
}