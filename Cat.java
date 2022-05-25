import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Wombat here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Cat extends Actor
{
    private int speed = 3;
    private boolean sprint = false;
    private int timing = 0;
    private int score = 0;
    private int index = 0;
    private boolean faceR = true;
    private boolean isMoving = false;
    private GreenfootImage[] frameR = new GreenfootImage[8];
    private GreenfootImage[] frameL = new GreenfootImage[8];
    
    public Cat()
    {
        for(int i = 0; i < 8; i++)
        {
            frameR[i] = new GreenfootImage("Run (" + (i + 1) + ").png");
            frameR[i].scale(frameR[i].getWidth() / 3, frameR[i].getHeight() / 3);
            frameL[i] = new GreenfootImage(frameR[i]);
            frameL[i].mirrorHorizontally();
        }
        setImage(frameR[0]);
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
            speed = 7;
        }
        else
        {
            speed = 2;
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
            faceR = false;
            isMoving = true;
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
            faceR = true;
            isMoving = true;
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
        
        if(isMoving)
        {
            index++;
            index %= 8;
            if(faceR)
            {
                setImage(frameR[index]);
            }
            else
            {
                setImage(frameL[index]);
            }
        }
        isMoving = false;
    }    
    
    public int getScore()
    {
        return score;
    }
}
