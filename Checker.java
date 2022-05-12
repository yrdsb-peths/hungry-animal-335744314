import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Checker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checker extends Actor
{
    private static int y = 0;
    private static int x = 0;
    private static int world = 1;
    
    public static void setY(int value)
    {
        y = value;
    }
    
    public static void setX(int value)
    {
        x = value;
    }
    
    public static int giveY()
    {
        return y;
    }
    
    public static int giveX()
    {
        return x;
    }
    
    public static void setWorld(int value)
    {
        world = value;
    }
    
    public static int giveWorld()
    {
        return world;
    }
}
