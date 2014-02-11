//Jim Yuan
//APCS2 pd 8
//HW02
//2014-02-10

import info.gridworld.actor.Bug;
public class ZBug extends Bug{

 private int steps;
    private int sideLength;
private 	boolean move = true;
    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;

    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
	    turn();
	    turn();
        while (steps < sideLength && move)
        {

            move();
            steps++;
        }

            turn();
            turn();
	    turn();

	    steps = 0;
	    while (steps < sideLength && move)
		{
		    move();
		    steps++;
		}
	    turn();
	    turn();
	    turn();
	    turn();
	    turn();
	    steps = 0;
	    while (steps < sideLength && move)
        {
            move();
            steps++;
        }
	    
	    move = false;
    }


}//end ZBug
