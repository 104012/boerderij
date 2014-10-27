import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mover extends Actor
{
    public static final int RIGHT = 0;
    public static final int LEFT  = 1;
    public static final int UP    = 2;
    public static final int DOWN  = 3;

    public int direction = Greenfoot.getRandomNumber(4);

    /**
    * An animal that can move.
    */
    public void Mover()
    {
    }
    
    public void act()
    {
    }

    /**
    * Method to check whether there is a specific object at current location.
    */
    public boolean foundSomething(Class<?> myClass)
    {
        return getObjectsAtOffset(0, 0, myClass).isEmpty() ? false : true;
    }

    /**
    * Kill a specific object on the same spot.
    */
    public void eatSomething(Class<?> myClass)
    {
        getWorld().removeObjects(getObjectsAtOffset(0, 0, myClass));
    }

    public void die()
    {
        getWorld().removeObject(this);
    }

    /**
    * Default move method.
    */
    public void move()
    {
        int x = 0, y = 0;
        // get a random direction and move to it
        switch (randomDirection()) {
            case DOWN:
                x = getX();
                y = getY() + 1;
                break;
            case RIGHT:
                x = getX() + 1;
                y = getY();
                break;
            case UP:
                x = getX();
                y = getY() - 1;
                break;
            case LEFT:
                x = getX() - 1;
                y = getY();
                break;
        }

        // case at world edge, bring to the other side
        if (x >= getWorld().getWidth())  x = 0;
        if (y >= getWorld().getHeight()) y = 0;
        if (x < 0) x = getWorld().getWidth()  - 1;
        if (y < 0) y = getWorld().getHeight() - 1;

        setLocation(x, y);
    }

    /**
    * Movers move random, but remain their direction 60% of the time.
    */
    public int randomDirection()
    {
        if (Greenfoot.getRandomNumber(100) < 60) {
            return direction;
        }
        direction = Greenfoot.getRandomNumber(4);
        return direction;
    }
}
