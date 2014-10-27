import greenfoot.*;

/** A wolf that eats goats.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Wolf extends Mover
{

    public Wolf()
    {
    }

    public void act()
    {
        move();
        if (foundSomething(Goat.class)) {
            eatSomething(Goat.class);
        } else if (foundSomething(Lettuce.class)) {
            die();
        }
    }
}