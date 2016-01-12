package fib;
public class FibonacciGenerator
{
private int one ;
private int two ;
private int counter = 0;
    public FibonacciGenerator()
    {
	one = 1;
	two = 1;
    }

	
    public int getNextValue()
    {
    	if ( counter==0||counter==1)
    	{
    		counter++;
    		return 1;
    		
    	}
    	int end = one+two;
    	one = two;
    	two=end;
    	return end;
    }
}