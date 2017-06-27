import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Ator
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int passo = 1;
    public boolean clickado = false;  
    public Lvl1 mundo;

    public Bomb(){
        setImage("bomb/" + passo + ".png");
    }    
    public void act() 
    {
        // Add your action code here.
        
        gerenciaClick();
        gerenciaDescida();
        gerenciaImagem(getWorldOfType(Lvl1.class));
        gerenciaCiclo(getWorldOfType(Lvl1.class));
        bombaSaiDeCena();
    }

    private void gerenciaClick(){
        if (Greenfoot.mouseClicked(this) && !clickado){          

            Greenfoot.playSound("syntetic-bomb.wav");
            mundo = getWorldOfType(Lvl1.class);

            mundo.addScore(-200);
            mundo.removeLifeOfScenario();
            

            clickado = true;
            passo = 3;

        }
    }

    private void gerenciaCiclo(Lvl1 mundo){
         if ((mundo.getCiclo()%8)==0) {
            if (passo == 2 && !clickado){
                passo=0;
            }

            passo++;
            
            
            
            
        }
    }
    private void gerenciaImagem(Lvl1 mundo){

        
        
        if (clickado){

            setImage("bombExplode/" + passo + ".png");
        }
        else {
            setImage("bomb/" + passo + ".png");
            turn(5);
            
        }
            
       
    }

    private void gerenciaDescida(){
        if (!clickado){
            if ((getWorldOfType(Lvl1.class).getCiclo()%4)==0){
                setLocation(getX(),getY()+5);
            }
        }
    }

    private void bombaSaiDeCena(){
        if (getY()==499 && !clickado) {
            getWorld().removeObject(this);
        }
        else if (clickado && passo==12){

            getWorld().removeObject(this);

        }
    }

    
}
