import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends SmoothMover
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String waterName;
    public Water(String waterName){
        this.waterName = waterName;
        setImage(this.waterName);
        getImage().scale(50, 50);
    }
    public void act() 
    {
       
    }    
}
