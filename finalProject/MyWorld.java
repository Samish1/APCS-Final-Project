import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public int score;
    private int timer;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        addObject(new Target(),(Greenfoot.getRandomNumber(getWidth())),Greenfoot.getRandomNumber(getHeight()));

        
        score = 0;
        if(Greenfoot.mouseClicked(Target.class)){
            
            score++;
            
        }
        //if(Greenfoot.mousePressed(Target.class)){
         //   score+=1;
         //   System.out.println("Score: "+score);
        //}
            System.out.println("Total score = " + score);
    }
    public void addTarget(){

        addObject(new Target(),(Greenfoot.getRandomNumber(getWidth())),Greenfoot.getRandomNumber(getHeight()));
    }

}
