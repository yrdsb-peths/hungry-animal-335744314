import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ice extends World
{

    /**
     * Constructor for objects of class Ice.
     * 
     */
    public Ice()
    {    
        super(800, 400, 1); 
        int locX = 0;
        int locY = 0;
        if(Checker.giveWorld() == 1)
        {
            locX = Checker.giveX();
        }
        else if(Checker.giveWorld() == 4)
        {
            locX = 789;
        }
        if(Checker.giveWorld() == 1)
        {
            locY = 389;
        }
        else if(Checker.giveWorld() == 4)
        {
            locY = Checker.giveY();
        }
        Dolphin player = new Dolphin(3);
        addObject(player, locX, locY);
    }
}
