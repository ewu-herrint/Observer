// Tyler Herrin

import java.util.Observable;

public class EyeOfSauron extends Observable 
{
	private int hobbits;
	private int elves;
	private int dwarves;
	private int men;
	
	public void setEnemies(int hobbits, int elves, int dwarves, int men) 
	{		
		this.hobbits = hobbits;
		this.elves = elves;
		this.dwarves = dwarves;
		this.men = men;
		
		// State has changed. Set so and notify observers.
		setChanged();
		notifyObservers();
	}
	
	public int getHobbits()
	{
		return this.hobbits;
	}

	public int getElves() 
	{
		return elves;
	}

	public int getDwarves() 
	{
		return dwarves;
	}

	public int getMen() 
	{
		return men;
	}

}
