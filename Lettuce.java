import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lettuce extends Mover
{
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
