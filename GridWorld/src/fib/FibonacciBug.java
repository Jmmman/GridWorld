package fib;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class FibonacciBug extends Bug
{
	FibonacciGenerator fib;
    public FibonacciBug()
    {
fib = new FibonacciGenerator();
    }

 
    @Override
    public void move()
    {

	
	NumberRock rock = new NumberRock(fib.getNextValue());
	Grid<Actor> gr = super.getGrid();
	Location loc= super.getLocation();
	super.move();
	rock.putSelfInGrid(gr, loc);
    }
}