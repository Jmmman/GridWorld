package ants;

import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class WorkerAnt extends Actor implements Processable{
private int foodQuantity=0;
private Location foodLoc=null;
private Location queenLoc=null;

public WorkerAnt()
{
Random rand = new Random();
int test= rand.nextInt((int)Location.FULL_CIRCLE/Location.HALF_RIGHT);
test = test*Location.HALF_RIGHT;
if (test==Location.NORTH)setDirection(Location.NORTH);
else if (test==Location.NORTHEAST)setDirection(Location.NORTHEAST);
	else if (test==Location.EAST)setDirection(Location.EAST);
		else if (test==Location.SOUTHEAST)setDirection(Location.SOUTHEAST);
			else if (test==Location.SOUTH)setDirection(Location.SOUTH);
				else if (test==Location.SOUTHWEST)setDirection(Location.SOUTHWEST);
					else if (test==Location.WEST)setDirection(Location.WEST);
						else if (test==Location.NORTHWEST) setDirection(Location.NORTHWEST);
}	
public void process(WorkerAnt ant) {
	
		ant.shareFoodLocation(foodLoc);
		ant.shareQueenLocation(queenLoc);
	}

	public int giveFood() {
		int end =foodQuantity;
		foodQuantity = 0;
		return end;
	}

	public void shareQueenLocation(Location location) {
	
		
	}

	public void takeFood(int bites) {
		foodQuantity+=bites;
		
	}

	public void shareFoodLocation(Location location) {
		
		
	}

}
