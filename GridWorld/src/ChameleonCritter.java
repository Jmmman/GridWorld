
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class ChameleonCritter extends Critter
{   public void processActors(ArrayList<Actor> actorList)
    {
        int count = actorList.size();
        
        
        if (count == 0)return;
        int random = (int) (Math.random() * count);

        Actor actorUsed = actorList.get(random);
        setColor(actorUsed.getColor());
    }

 
    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
