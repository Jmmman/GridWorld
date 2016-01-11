import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class BackAndForthFibonacciBug extends Bug
{
	FibonacciGenerator fib;
    public BackAndForthFibonacciBug()
    {
fib = new FibonacciGenerator();
super.setDirection(90);
    }
@Override
 public void act()
 {
	if (canMove())
        move();
    else
    	turn();
    	turn();

 }
   
    }
