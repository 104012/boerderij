import greenfoot.*;

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
