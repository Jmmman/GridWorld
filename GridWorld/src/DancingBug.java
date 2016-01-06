import info.gridworld.actor.Bug;


public class DancingBug extends Bug 
{
private int[] data;
private int count=0;
	public DancingBug (int[] array)
	{
		super();
	data= array;	
		
	}
	public DancingBug (int[] array, java.awt.Color bugColor)
	{
		super(bugColor);
		data= array;
		
	}
	
	public void act ()
	{
		for (int count2=0;count2<data[count];count2++)
		{
			turn();
		}
		count++;
		if (count>data.length)
		{count=0;}
		move();
	}
	
}
