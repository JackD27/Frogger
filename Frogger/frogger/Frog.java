import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Collision
{
    World myWorld = getWorld();
    Map frogger = (Map)myWorld;
    Counter counter;
    Orb orb;
    public Frog(Counter c){
        counter = c;
    }
    
    public void act() 
    {
        moveAround();
        touchedObject();
        win();
        getImage().scale(38, 38); //frog size
    }    
    public void moveAround(){
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            move(-2);
        }
        else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            move(2);
        }
        else if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 2);
        }
        else if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 2);
        }
    }
    public void win(){
        if (getY() < 45){
           getWorld().showText("You WON, keep going!!! Good Job!!", getWorld().getWidth() / 2, 50);
           Greenfoot.playSound("fanfare.wav");
           Greenfoot.delay(150);
           //Greenfoot.playSound("fanfare.wav");
           setLocation(375, 710);
           counter.add(1);
           getWorld().showText("", getWorld().getWidth() / 2, 50);
        }
    }
    
    public void  touchedObject(){
        if(touch(Enemy.class)) {
           getWorld().showText("You LOST and got hit by a vehicle!! Your score was "+counter.getValue(), getWorld().getWidth() / 2, 50);
           Greenfoot.playSound("au.wav");
           Greenfoot.stop();
       }
       if (isTouching(Water.class) && !isTouching(Log.class)){
           getWorld().showText("You LOST and drowned!! Your score was "+counter.getValue(), getWorld().getWidth() / 2, 50);
           Greenfoot.playSound("au.wav");
           Greenfoot.stop();
        }
       if(touch(Orb.class)) {
           counter.add(10);
           Greenfoot.playSound("slurp.wav");
           removeTouching(Orb.class);
       }
      }
}