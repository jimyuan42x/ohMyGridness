//Jim Yuan
//APCS2 pd 8
//HW02
//2014-02-10

import info.gridworld.actor.Bug;

public class DancingBug extends Bug{


 private int steps;
    private int[] _turns;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] turns)
    {
        steps = 0;
        _turns = turns;
	for (int i = 0; i < turns.length; i++){
	    _turns[i] = (int)(Math.random()* 10);
	}
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if ( canMove())
        {

	    for (int i = 0; i < _turns.length; i++){
		for (int j = 0; j < _turns[i]; j++){
		    turn();
		}
		move();
	    }


        }
    }

}//end DancingBug
