package ants;

import info.gridworld.actor.Actor;

public class Food extends Actor implements Processable{
private final int BITE_SIZE;
private int foodEaten; 
	
public Food(int biteSize)
{
	BITE_SIZE=biteSize;
	foodEaten=0;
	setColor(null);
}
public void act(){}
public void process(WorkerAnt ant) 
{
ant.takeFood(BITE_SIZE);
ant.shareFoodLocation(super.getLocation());
}

public String toString ()
{
return super.toString()+BITE_SIZE+" "+foodEaten;	
}
}
