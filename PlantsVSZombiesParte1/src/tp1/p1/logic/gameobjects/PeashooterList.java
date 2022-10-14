package tp1.p1.logic.gameobjects;

public class PeashooterList {

	private Peashooter[] peashooters;// Array de Peashooters;

	private int count; // contador de cuántos tengo
	
	public PeashooterList(int size) {
	// constructor : crea lo necesario
		//this.peashooters = new Peashooter[count];
		this.count = size;
	}
	
	public void add(Peashooter peashooter) {
		// añado el peashooter al array, sumo uno al contador
		Peashooter[] nuevo = new Peashooter[count + 1];
		
		for(int i = 0; i < count; ++i)
		{
			nuevo[i] = this.peashooters[i];
		}
		nuevo[count] = peashooter;
		count++;
		peashooters = nuevo;
	}
	
	public Peashooter getPeashooterInPosition(int col, int row) {
	  //  busca en el array un peashooter que tenga esa posición en el tablero
	  // y lo devuelve. Sin nohay devuelve null
		for(int i = 0; i < count; ++i)
		{
			if(this.peashooters[i].isInPosition(col, row))
			{
				return this.peashooters[i];
			}
		}
		return null;
	}
	
	public boolean isPositionEmpty(int col, int row) {
		return getPeashooterInPosition(col, row) == null;
	}

	public void update() {
	// recorre el array , llamando al update de cada peashooter
		for(int i = 0; i < count; ++i)
		{
			this.peashooters[i].update();
		}
	}
}


