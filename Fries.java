import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fries extends Actor
{
    private static int fallSpeed = 3;
    
    public void act()
    {
        setLocation(getX(), getY() + fallSpeed);
        if(getY() >= 635)
        {
            MyWorld world = (MyWorld) getWorld();
            world.end();
            world.removeObject(this);
        }
    }
    
    public static void setFallSpeed(int newValue)
    {
        fallSpeed = newValue;
    }
    
    public static int getFallSpeed()
    {
        return fallSpeed;
    }
}
