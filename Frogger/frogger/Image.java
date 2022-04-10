import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image extends Actor
{
    String imageName;
    String road;
    public Image(String imageName){
        this.imageName = imageName;
        setImage(this.imageName);
        getImage().scale(50, 50);
        
        if (this.imageName == "Road3.jpg"){
            getImage().rotate(90);
            getImage().scale(50, 50);
        }
    }
    public void act() 
    {
        
    }    
}
