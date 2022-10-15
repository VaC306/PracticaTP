package tp1.p1.logic.gameobjects;

public class SunflowerList {

	private Sunflower[] sunflowers;// Array de Sunflower;

	private int count; // contador de cuántos tengo
	
	public SunflowerList(int size) {
	// constructor : crea lo necesario
		this.count = size;
	}
	
	public void add(Sunflower sunflower) {
		// añado el sunflower al array, sumo uno al contador
		Sunflower[] nuevo = new Sunflower[count + 1];
		
		for(int i = 0; i < count; ++i)
		{
			nuevo[i] = this.sunflowers[i];
		}
		
		nuevo[count] = sunflower;
		count++;
		sunflowers = nuevo;	
		
	}
	
	public Sunflower getSunflowerInPosition(int col, int row) {
	  //  busca en el array un sunflower que tenga esa posición en el tablero
	  // y lo devuelve. Sin nohay devuelve null
		for(int i = 0; i < count; ++i)
		{
			if(this.sunflowers[i].isInPosition(col, row))
			{
				return this.sunflowers[i];
			}
		}
		
		return null;
	}
	
	public boolean isPositionEmpty(int col, int row) {
		return getSunflowerInPosition(col, row) == null;
	}

	public void update() {
	
		for(int i = 0; i < count; ++i)
		{
			this.sunflowers[i].update();
		}
	// recorre el array , llamando al update de cada sunflower	
	}
}
