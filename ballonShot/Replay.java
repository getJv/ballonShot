import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Replay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Replay extends Ator
{
    /**
     * Act - do whatever the Replay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public Replay(){
        
    }
    public void act() 
    {
        // Add your action code here.
        gerenciaClick();    
    }
    
     private void gerenciaClick(){
        if (Greenfoot.mouseClicked(this)){          

            
            Greenfoot.setWorld(new Lvl1());
            
            
        }
    }
}
