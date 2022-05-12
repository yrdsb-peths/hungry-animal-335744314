import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Brick here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Brick extends World
{
    
    /**
     * Constructor for objects of class Brick.
     * 
     */
    public Brick()
    {    
        super(800, 400, 1); 
        int locX = 0;
        int locY = 0;
        if(Checker.giveWorld() == 3)
        {
            locX = 11;
        }
        else if(Checker.giveWorld() == 2)
        {
            locX = Checker.giveX();
        }
        if(Checker.giveWorld() == 3)
        {
            locY = Checker.giveY();
        }
        else if(Checker.giveWorld() == 2)
        {
            locY = 389;
        }
        Dolphin player = new Dolphin(4);
        addObject(player, locX, locY);
    }
}
