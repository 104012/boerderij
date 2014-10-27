import greenfoot.*;

public class FarmWorld extends World
{

    /**
     * Constructor for objects of class FarmWorld.
     * 
     */
    public FarmWorld()
    {    
        super(15, 12, 60);
        populate(); 
        addObject(new ScoreBoard(), 1, 0);
        addObject(new GameOver(), 7, 5);
    }

    public void populate()
    {
        int x, y;
        //Loop three times for each actor class
        for (int counter = 0; counter < 3; counter++) {
            //Loop five times to spawn each object 5 times.
            for (int i = 0; i < 5; i++) {
                x = Greenfoot.getRandomNumber(15);
                y = Greenfoot.getRandomNumber(12);
                //If there is nothing at the selected coordinates:
                if (getObjectsAt(x, y, null).isEmpty()) {
                    if (counter == 1) {
                        addObject(new Wolf(), x, y);
                    } else if (counter == 2) {
                        addObject(new Lettuce(), x, y);
                    } else {
                        addObject(new Goat(), x, y);
                    }
                } else {
                    i--; //Loop one more time.
                }
            }
        }
    }
}
