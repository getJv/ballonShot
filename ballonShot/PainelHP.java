import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PainelHP extends Ator
{
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private List<Life> vidas;
    private Lvl1 mundo;
    public PainelHP(){
        setImage(new GreenfootImage(10,10));
        
        
        vidas = new ArrayList<Life>();
        vidas.add(new Life()); 
        vidas.add(new Life()); 
        vidas.add(new Life());
        vidas.add(new Life()); 
    } 

    public void act() 
    {
        adicionaVidasNoPainel();
    }

    public void removeLife(){
        if (!vidas.isEmpty()){
            
            getWorld().removeObject(vidas.get(vidas.size()-1));
            vidas.remove(vidas.size()-1);
            
        
        }
        else {
            getWorld().showText("Game Over", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    
    }
    
    public void adicionaVidasNoPainel(){
        mundo = getWorldOfType(Lvl1.class);
        int u=0;
        for(Life vida: vidas){
            
            u+=30;
            mundo.addObject(vida, getX(), getY()+u);
            
           
        }
    }
    
    
}
