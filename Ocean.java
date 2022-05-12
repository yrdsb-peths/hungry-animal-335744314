import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{
    public static boolean s = false;
    
    public Ocean()
    {    
        super(800, 400, 1); 
        int locX = 0;
        int locY = 0;
        if(Checker.giveWorld() == 3)
        {
            locX = Checker.giveX();
        }
        else
        {
            locX = 789;
        }
        if(Checker.giveWorld() == 2)
        {
            locY = Checker.giveY();
        }
        else
        {
            locY = 10;
        }
        
        Dolphin player = new Dolphin(1);
        if(s)
        {
            addObject(player, locX, locY);
        }
        else
        {
            addObject(player, 400, 200);
        }
        s = true;
    }
    
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
}
