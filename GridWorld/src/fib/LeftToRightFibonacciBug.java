package fib;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftToRightFibonacciBug extends Bug {
FibonacciGenerator fib;
private int counter;
private Location loc;
	public LeftToRightFibonacciBug()
	{
		counter=0;
		fib = new FibonacciGenerator();
		super.setDirection(90);
	}

	public void act()
	{
		if (canMove())
		{
			loc = getLocation();
			move();
			NumberRock rock = new NumberRock(fib.getNextValue());
			Grid<Actor> gr = super.getGrid();
			rock.putSelfInGrid(gr, loc);
		}
		else
		{
			loc = getLocation();
			counter++;
			Grid<Actor> grid = super.getGrid();
			super.removeSelfFromGrid();
			super.putSelfInGrid(grid, new Location(counter, 0));
			NumberRock rock = new NumberRock(fib.getNextValue());
			Grid<Actor> gr = super.getGrid();
			rock.putSelfInGrid(gr, loc);
		}
	}
	
}
