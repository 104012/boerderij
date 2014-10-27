import greenfoot.*; 

/** A goat that eats lettuces.
*
* @author (your name)
* @version (a version number or a date)
*/

public class Goat extends Mover
{
    public Goat()
    {
    }

    public void act()
    {
        move();
        if (foundSomething(Lettuce.class)) {
            eatSomething(Lettuce.class);
        } else if (foundSomething(Wolf.class)) {
            die();
        }
    }
}