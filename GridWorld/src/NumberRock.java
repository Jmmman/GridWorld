import info.gridworld.actor.Rock;

import java.awt.Color;

public class NumberRock extends Rock
{
	 private int data;
	public NumberRock(int v)
	{
	   super();
	  data = v;
	  super.setColor(Color.WHITE);
	}

	
	public String getText()
	{
		return ""+data;
	}
}