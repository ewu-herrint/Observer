// Tyler Herrin

import java.util.Observable;
import java.util.Observer;

public class BadGuy implements Observer 
{
	Observable eye;
	private String name;
	
	private int hobbits;
	private int elves;
	private int dwarves;
	private int men;

	public BadGuy(EyeOfSauron eye, String name) 
	{
		this.eye = eye;
		this.name = name;
		// All BadGuys serve the Eye of Sauron so add to Observer.
		eye.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		if(o instanceof EyeOfSauron)
		{
			EyeOfSauron eye = (EyeOfSauron)o;
			this.hobbits = eye.getHobbits();
			this.elves = eye.getElves();
			this.dwarves = eye.getDwarves();
			this.men = eye.getMen();
		}
	}
	
	public void report()
	{
		System.out.println(name + ": There are " + this.hobbits + " hobbits, " + this.elves + " elves, "
				+ this.dwarves + " dwarves, and " + this.men + " men.");
	}

	public void defeated() 
	{
		eye.deleteObserver(this);
	}
}
