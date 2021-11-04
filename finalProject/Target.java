import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
public class Target extends Actor
{
    int hit = 0;
    int total = 0;
    MouseInfo mouse = Greenfoot.getMouseInfo();
    int timer = 1800;
    public void act() 
    {
        if (timer>0){
            if(mouse !=null){
                if(Greenfoot.mouseClicked(this)){
                    
                    setLocation((int) (Math.random()*getWorld().getWidth()), (int) (Math.random()*getWorld().getHeight()));
                    hit = hit+1;
                    System.out.println(hit);   
                    total=total+1;
                    //System.out.println(mouse.getClickCount());
                    System.out.println(total);
                }
                else if(Greenfoot.mouseClicked(null)){
                
                    total = total + 1;
                    System.out.println(hit);
                    System.out.println(total);
                
                }
            
            }    
            timer-=1;
            if(timer%60==0){
                System.out.print(timer/60);
            }
        }
        
        else if (timer<=0){
            getImage().setTransparency(0);
            
        }
    }
}