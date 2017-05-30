import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ballon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ballon extends Ator
{
    /**
     * Act - do whatever the Ballon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int passo=1;
    public Ballon(){
        setImage("ballon/ballon0.png");
    }
    public void act() 
    {
        // Add your action code here.
        setImage("ballon/ballon" + passo + ".png");
        passo++;
        if (passo==6){
            passo=1;
        }
    }    
}
