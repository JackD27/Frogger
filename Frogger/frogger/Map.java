import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{
    int randomX = getRandomNumber(15, 730);
    int randomY = getRandomNumber(75, 650);
    Counter counter = new Counter("Score:");
    Frog frog = new Frog(counter);
    Orb orb = new Orb();
    
    private GreenfootImage road = new GreenfootImage("Road3.jpg");
    
    int map [][] = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {3,1,1,1,1,1,3,3,1,1,3,1,1,1,3,3},
                    {1,1,4,4,1,1,1,1,1,1,4,4,1,1,1,1},
                    {1,1,1,1,1,1,6,6,6,6,1,1,1,1,6,6},
                    {1,1,1,3,3,1,1,1,1,1,1,3,3,1,1,1},
                    {1,1,1,1,1,1,1,1,4,4,1,1,1,4,4,1},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {2,2,2,2,5,2,2,2,5,2,2,2,2,5,2,2},
                    {2,8,2,2,2,2,8,2,2,2,2,8,2,2,8,2},
                    {2,2,2,7,2,2,2,7,2,2,2,2,7,2,2,2},
                    {2,2,8,2,2,2,2,2,2,2,8,2,2,2,2,2},
                    {2,2,2,2,2,2,2,8,2,2,2,2,2,8,2,2},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
    public Map()
    {   
      super(750, 750, 1); // map size
        
         for (int row = 0; row < 16; row++){ // row
            for (int column = 0; column < 16; column++){ // column
                if (map[row][column] == 0){
                    addObject(new Image("sand2.jpg"), column * 50, row * 50);
                }
                else if (map[row][column] == 1){
                    addObject(new Water("wet-blue.jpg"), column * 50, row * 50);
                }
                else if (map[row][column] == 2){
                    addObject(new Image("Road3.jpg"), column * 50, row * 50);
                }
                else if (map[row][column] == 3){
                    addObject(new Log("log.png"), column * 50, row * 50);
                    addObject(new Water("wet-blue.jpg"), column * 50, row * 50);
                }
                else if (map[row][column] == 4){
                    addObject(new Log("turtle2.png"), column * 50, row * 50);
                    addObject(new Water("wet-blue.jpg"), column * 50, row * 50);
                }
                else if (map[row][column] == 5){
                    addObject(new Enemy(0), column * 50, row * 50);
                    addObject(new Image("Road3.jpg"), column * 50, row * 50);
                }
                else if (map[row][column] == 6){
                    addObject(new Log("boat01.png"), column * 50, row * 50);
                    addObject(new Water("wet-blue.jpg"), column * 50, row * 50);
                }
                 else if (map[row][column] == 7){
                    addObject(new Enemy(1), column * 50, row * 50);
                    addObject(new Image("Road3.jpg"), column * 50, row * 50);
                }
                 else if (map[row][column] == 8){
                    addObject(new Enemy(2), column * 50, row * 50);
                    addObject(new Image("Road3.jpg"), column * 50, row * 50);
                }
            }
            addObject(frog, 375, 710);
            addObject(counter, 48, 17);
            addObject(orb, randomX, randomY);
            
            setPaintOrder(Frog.class, Orb.class, Counter.class, Log.class, Enemy.class, Water.class);
      }  
  }
   
  public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal + start;
    }
}



