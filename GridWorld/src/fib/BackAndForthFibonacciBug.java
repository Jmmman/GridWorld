package fib;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class BackAndForthFibonacciBug extends Bug
{
	private int counter;
	FibonacciGenerator fib;
    public BackAndForthFibonacciBug()
    {
fib = new FibonacciGenerator();
super.setDirection(90);
counter=0;
    }
@Override
 public void act()
 {
	if (counter==0)
	{
		if (canMove())
		{
			move();
		}
		else
		{
			turn();
			turn();
			counter++;
		}
		
	}

	else if (counter==1)
	{
		if (canMove())
		{
			move();
			turn();
			turn();
			counter++;
		}
		else
		{
			counter=0;
		}
		
	}
	
	else if (counter==2)
	{
		if (canMove())
		{
			move();
			
		}
		else
		{
			turn();
			turn();
			turn();
			turn();
			turn();
			turn();
			counter++;
		}
		
	}
	
	else if (counter==3)
	{
		if (canMove())
		{
			move();
			turn();
			turn();
			turn();
			turn();
			turn();
			turn();
			counter=0;
			
		}
		else
		{
			counter=0;
		}
		
	}
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
