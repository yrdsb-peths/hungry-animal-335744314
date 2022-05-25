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
    private int score;
    private int previousX;
    private Label showScore = new Label(score, 50);
    private Label gameOver = new Label("Game Over!", 100);
    private Label winner = new Label("You Win!", 100);
    private Label epilogue = new Label("The cat is now obese", 50);
    private boolean ended;
    private int delay;
    private boolean won;
    
    public MyWorld()
    {    
        super(1050, 639, 1);
        score = 0;
        delay = 300;
        ended = false;
        won = false;
        Fries.setFallSpeed(3);
        previousX = 525;
        
        addObject(player, 525, 550);
        addFries();
        addObject(showScore, 75, 50);
    }

    public void act() 
    {
        //setBackground(frames.getCurrentImage());
        if(score != player.getScore() && !ended)
        {
            score = player.getScore();
            if(score == 36)
            {
                won = true;
                addObject(winner, 525, 300);
                addObject(epilogue, 525, 500);
            }
            else
            {
                addFries();
            }
            setScore();
            if(score != 0 && score % 5 == 0)
            {
                Fries.setFallSpeed(Fries.getFallSpeed() + 1);
            }
        }
        
        if(ended || won)
        {
            delay--;
            if(delay == 0)
            {
                Greenfoot.setWorld(new TitleScreen());
            }
        }
    }    
    
    public void addFries()
    {
        previousX = previousX + (Greenfoot.getRandomNumber(950) - 450);
        addObject(new Fries(), previousX, 0);
    }
    
    public void setScore()
    {
        showScore.setValue(score);
    }
    
    public void end()
    {
        addObject(gameOver, 525, 300);
        ended = true;
    }
}
