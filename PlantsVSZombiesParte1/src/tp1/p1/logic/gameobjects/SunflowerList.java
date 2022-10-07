package tp1.p1.logic.gameobjects;

public class SunflowerList {

	private Sunflower[] sunflowers;// Array de Sunflower;

	private int count; // contador de cuántos tengo
	
	public SunflowerList(int size) {
	// constructor : crea lo necesario
	}
	
	public void add(Sunflower sunflower) {
		// añado el sunflower al array, sumo uno al contador
	}
	
	public Sunflower getSunflowerInPosition(int col, int row) {
	  //  busca en el array un sunflower que tenga esa posición en el tablero
	  // y lo devuelve. Sin nohay devuelve null
		return;
	}
	
	public boolean isPositionEmpty(int col, int row) {
		return getSunflowerInPosition(col, row) == null;
	}

	public void update() {
	// recorre el array , llamando al update de cada sunflower
	}
}
