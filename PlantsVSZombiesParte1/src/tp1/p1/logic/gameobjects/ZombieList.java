package tp1.p1.logic.gameobjects;

public class ZombieList {
	
	private Zombie[] zombielist;
	
	private int count=0;
	
	public ZombieList(int size) 
	{
		
		this.zombielist = new Zombie[size];
		
	}
	
	public void add(Zombie zombie) 
	{
		
		zombielist[count]= zombie;
		count++;
		
	}
	
	public Zombie getZombieInPosition(int col, int row) 
	{
	
		
		for(int i = 0; i < count; ++i)
		{
			if(this.zombielist[i].isInPosition(col, row))
			{
				return this.zombielist[i];
			}
		}
		
	return null;
	
	}
	
	
	public boolean isPositionEmpty(int col, int row) 
	{
		
		return getZombieInPosition(col, row) == null;
		
	}
	
	public boolean ZombieArrived() 
	{
		
		for(int i = 0; i < count; ++i)
		{
			if(this.zombielist[i].isArrived())
			{
				return true;
			}
		}
		return false;
	}
	
	
	public boolean ZombieAlived() 
	{
		
		for(int i = 0; i < count; ++i)
		{
			if(this.zombielist[i].isAlive())
			{
				return true;
			}
		}
		return false;
	}
	
	public void update()
	{
		
		
		
	}
}