import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
	public final float FONT_SIZE = 48.0f;
	public final int WIDTH = 600;
	public final int HEIGHT = 600;

    public void act() 
    {
    	checkGameOver();
    }

    public void checkGameOver()
    {
    	if (ScoreBoard.goat_Score == 0) {
    		makeGameOverBoard("Lettuce");
    	} else if (ScoreBoard.lettuce_Score == 0) {
    		makeGameOverBoard("Wolf");
    	} else if (ScoreBoard.wolf_Score == 0) {
    		makeGameOverBoard("Goat");
    	}
    }

    private void makeGameOverBoard(String winner)
    {
    	GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

    	// create scoreboard text
    	String wins = " wins!";

    	// creates the background rectangles
    	image.setColor(new Color(255, 255, 255, 128));
    	image.fillRect(0, 60, WIDTH, HEIGHT - 60);

    	image.setColor(new Color(0, 0, 0, 64));
    	image.fillRect(5, 65, WIDTH - 10, HEIGHT - 70);

    	// font settings
    	Font font = image.getFont();
    	font = font.deriveFont(FONT_SIZE);
    	image.setFont(font);
    	image.setColor(Color.BLACK);

    	// make the text of who wins
    	image.drawString(winner + wins, 160, 320);

    	// create the scoreboard
    	setImage(image);
    }
}
