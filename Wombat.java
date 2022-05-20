import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Actor
{
    private int speed = 2;
    private boolean sprint = false;
    private int timing = 0;
    private int score = 0;
    
    public Wombat()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() * 2, img.getHeight() * 2);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("shift"))
        {
            sprint = true;
        }
        else
        {
            sprint = false;
        }
        
        if(sprint)
        {
            speed = 4;
        }
        else
        {
            speed = 2;
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            timing++;
            if(timing <= 1 && isTouching(Fries.class))
            {
                removeTouching(Fries.class);
                score++;
            }
        }
        else
        {
            timing = 0;
        }
    }    
    
    public int getScore()
    {
        return score;
    }
}
