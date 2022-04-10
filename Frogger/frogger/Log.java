import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log extends SmoothMover
{
    int count = 0;
    String logName;
    public Log(String logName){
        this.logName = logName;
        setImage(this.logName);
        getImage().scale(50, 50);
    }
    public void act() 
    {
        if (this.logName == "log.png"){
            move(-.6);
       }
       else if (this.logName == "boat01.png"){
           move(1);
        }
        else{
           move(.6);
        }
       if(getX() == 0){
           setLocation(getWorld().getWidth() - 2, getY());
        }
       if(getX() == getWorld().getWidth() - 1){
           setLocation(1, getY());
        }
    }    
}
