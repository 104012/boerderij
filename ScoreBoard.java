import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import java.util.List;

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ScoreBoard extends Actor
{
    public static final float FONT_SIZE = 12.0f;
    public static final int WIDTH = 180;
    public static final int HEIGHT = 60;
    public static int lettuce_Score;
    public static int goat_Score;
    public static int wolf_Score;


    public void Scoreboard()
    {
        makeImage();
    }

    public int numberOf(Class<?> cls)
    {
        return getWorld().getObjects(cls).size();
    }

    public void act()
    {
        makeImage();
    }   //Updates the scoreboard

    private void makeImage()
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        lettuce_Score = numberOf(Lettuce.class);
        goat_Score = numberOf(Goat.class);
        wolf_Score = numberOf(Wolf.class);
        // create scoreboard text
        String lettuce_title = "Lettuce";
        String goat_title = "Goat";
        String wolf_title = "Wolf";
        String prefix = "Alive: ";

        // create scoreboard rectangles
        image.setColor(new Color(255, 255, 255, 128));
        image.fillRect(0, 0, WIDTH, HEIGHT);

        image.setColor(new Color(0, 0, 0, 64));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);

        // font settings
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.BLACK);

        // update score for each animal
        image.drawString(lettuce_title, 8, 20);
        image.drawString(prefix + lettuce_Score, 8, 40);

        image.drawString(goat_title, 68, 20);
        image.drawString(prefix + goat_Score, 68, 40);

        image.drawString(wolf_title, 128, 20);
        image.drawString(prefix + wolf_Score, 128, 40);

        setImage(image); //Creates the scoreboard
    }
}
