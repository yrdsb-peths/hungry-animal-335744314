import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label start = new Label("Press Space to Start", 75);
    GreenfootSound bop = new GreenfootSound("Time_to_Fight.mp3");
    private boolean hasStarted;
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 639, 1); 
        addObject(start, 525, 550);
        hasStarted = false;
    }
    
    public void act()
    {
        if(!hasStarted)
        {
            hasStarted = true;
            bop.setVolume(65);
            bop.playLoop();
        }
        if(Greenfoot.isKeyDown("space"))
        {
            bop.pause();
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
