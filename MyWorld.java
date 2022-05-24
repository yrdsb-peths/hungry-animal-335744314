import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //private GifImage frames = new GifImage("Giphy.gif");
    private Cat player = new Cat();
    private int score = 0;
    private Label showScore = new Label(score, 30);
    
    public MyWorld()
    {    
        super(1050, 639, 1); 
        addFries();
        addObject(player, 575, 450);
        addObject(showScore, 75, 50);
    }

    public void act() 
    {
        //setBackground(frames.getCurrentImage());
        if(score != player.getScore())
        {
            score = player.getScore();
            addFries();
            setScore();
        }
    }    
    
    public void addFries()
    {
        addObject(new Fries(), Greenfoot.getRandomNumber(950) + 50, 0);
    }
    
    public void setScore()
    {
        showScore.setValue(score);
    }
}
