import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class dolphin here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Dolphin extends Actor
{
    boolean sprint = false;
    boolean move = false;
    int score = 0;
    int numK = 200;
    private int world;
    
    public Dolphin(int world)
    {
        this.world = world;
        Checker.setWorld(world);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("shift") == true)
        {
            sprint = true;
        }
        else
        {
            sprint = false;
        }
        
        if(Greenfoot.isKeyDown("d") == true)
        {
            if(Greenfoot.isKeyDown("w") == true)
            {
                setRotation(315);
            }
            else if(Greenfoot.isKeyDown("s") == true)
            {
                setRotation(45);
            }
            else
            {
                setRotation(0);
            }
            move = true;
        }
        else if(Greenfoot.isKeyDown("a") == true)
        {
            if(Greenfoot.isKeyDown("w") == true)
            {
                setRotation(225);
            }
            else if(Greenfoot.isKeyDown("s") == true)
            {
                setRotation(135);
            }
            else
            {
                setRotation(180);
            }
            move = true;
        }
        else if(Greenfoot.isKeyDown("w") == true)
        {
            setRotation(270);
            move = true;
        }
        else if(Greenfoot.isKeyDown("s") == true)
        {
            setRotation(90);
            move = true;
        }
        else
        {
            move = false;
        }
        
        if(move == true)
        {
            if(sprint == true)
            {
                move(10);
            }
            else
            {
                move(4);
            }
        }
            
        if(getX() >= 790 && world == 1)
        {
            Greenfoot.setWorld(new Section());
        }
        else if(getX() <= 10 && world == 2)
        {
            Greenfoot.setWorld(new Ocean());
        }
        else if(getY() <= 10 && world == 1)
        {
            Greenfoot.setWorld(new Ice());
        }
        else if(getY() >= 390 && world == 3)
        {
            Greenfoot.setWorld(new Ocean());
        }
        else if(getY() <= 10 && world == 2)
        {
            Greenfoot.setWorld(new Brick());
        }
        else if(getY() >= 390 && world == 4)
        {
            Greenfoot.setWorld(new Section());
        }
        else if(getX() >= 790 && world == 3)
        {
            Greenfoot.setWorld(new Brick());
        }
        else if(getX() <= 10 && world == 4)
        {
            Greenfoot.setWorld(new Ice());
        }
        Checker.setY(getY());
        Checker.setX(getX());
    }
}
