import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{

    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    public int ciclo=1;
    public Lvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        addObject(new Ballon(), 200, 450);
    }
    
    public void act(){
        //showText(String.valueOf(ciclo++), 100,100);
        ciclo++;
        if (ciclo==1000){
            ciclo = 1;
        }
        
        
        
    }
    
    public int getCiclo(){
        return ciclo;
    }
}
