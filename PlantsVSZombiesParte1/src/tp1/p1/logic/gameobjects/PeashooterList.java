package tp1.p1.logic.gameobjects;

public class PeashooterList {

	private Peashooter[] peashooters;// Array de Peashooters;

	private int count; // contador de cu�ntos tengo
	
	public PeashooterList(int size) {
	// constructor : crea lo necesario
	}
	
	public void add(Peashooter peashooter) {
		// a�ado el peashooter al array, sumo uno al contador
	}
	
	public Peashooter getPeashooterInPosition(int col, int row) {
	  //  busca en el array un peashooter que tenga esa posici�n en el tablero
	  // y lo devuelve. Sin nohay devuelve null
		return ;
	}
	
	public boolean isPositionEmpty(int col, int row) {
		return getPeashooterInPosition(col, row) == null;
	}

	public void update() {
	// recorre el array , llamando al update de cada peashooter
	}
}


