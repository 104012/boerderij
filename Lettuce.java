import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lettuce that kills wolves.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lettuce extends Mover
{
    /**
     * Act - do whatever the Lettuce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        if (foundSomething(Wolf.class)) {
            eatSomething(Wolf.class);
        } else if (foundSomething(Goat.class)) {
            die();
        }
    }    
}
