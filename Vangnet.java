import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


/**
 * Write a description of class Vangnet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vangnet extends Mover
{
    public String upKey, downKey, leftKey, rightKey, netImage;
    public boolean netFull = false;
    public int roundNumber = 0;
    public Actor caughtMob;

    public void act()
    {
        move(keyPressed());
        catchMob();
    }

    public Vangnet(int player) throws IOException
    {
        if (player > 3 || player < 1) {
            player = 1;
        }
        Properties user = new Properties();
        user.load(new FileInputStream("users.properties"));
        upKey = user.getProperty("p"+player+"up");
        downKey = user.getProperty("p"+player+"down");
        leftKey = user.getProperty("p"+player+"left");
        rightKey = user.getProperty("p"+player+"right");
        netImage = user.getProperty("p"+player+"image");
        /** aparte player image werkt niet, aparte controls wel.
        GreenfootImage image = new GreenfootImage(netImage);
        setImage(image); */
    }

    public void catchMob()
    {
        if (netFull == false) {
            caughtMob = getOneObjectAtOffset(0, 0, Actor.class);
            netFull = true;
        }
        if (roundNumber < 10 && netFull == true) { 
            roundNumber++;
            caughtMob.setLocation(getX(), getY());
        } else {
            roundNumber = 0;
            netFull = false;
        }
    }

    public int keyPressed() {
        if (Greenfoot.isKeyDown(upKey))
            return UP;
        if (Greenfoot.isKeyDown(downKey))
            return DOWN;
        if (Greenfoot.isKeyDown(leftKey))
            return LEFT;
        if (Greenfoot.isKeyDown(rightKey))
            return RIGHT;
        return 5;
    }
   
}
