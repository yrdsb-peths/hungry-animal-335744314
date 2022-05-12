import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Section here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Section extends World
{
    public Section()
    {    
        super(800, 400, 1);
        int locX = 0;
        int locY = 0;
        if(Checker.giveWorld() == 1)
        {
            locX = 11;
        }
        else if(Checker.giveWorld() == 4)
        {
            locX = Checker.giveX();
        }
        if(Checker.giveWorld() == 1)
        {
            locY = Checker.giveY();
        }
        else if(Checker.giveWorld() == 4)
        {
            locY = 10;
        }
        Dolphin player = new Dolphin(2);
        addObject(player, locX, locY);
    }
}
