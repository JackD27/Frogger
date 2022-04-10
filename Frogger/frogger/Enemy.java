import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends SmoothMover
{
    boolean car1 = false;
    boolean car2 = false;
    boolean car3 = false;
    boolean ambulance = false;
    public Enemy(int carColor){
        int random = Greenfoot.getRandomNumber(2);
        if (carColor == 0){
            setImage("ambulance.png");
            getImage().scale(100, 50);
            getImage().rotate(180);
            ambulance = true;
        }
        if (carColor == 1){
            setImage("car01.png");
            getImage().scale(50, 50);
            getImage().rotate(180);
            car1 = true;
        }
        if (carColor == 2){
            if (random == 0){
                setImage("car02.png");
                getImage().scale(50, 50);
                car2 = true;
            }
            else{
                setImage("car03.png");
                getImage().scale(50, 50);
                car3 = true;
            }
        }
    }
    public void act() 
    {
       if (car1){
          
          move(-2);
        }
       if (car2 || car3){
          move(1.3);
        }
       if (ambulance){
           
          move(-1);
        }
       if(getX() == 0){
           setLocation(getWorld().getWidth() - 2, getY());
        } 
       if(getX() == getWorld().getWidth() - 1){
           setLocation(1, getY());
        }
    }    
}
