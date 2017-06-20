import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Ator
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int passo=1;
    private boolean clickado = false;
    
    public Coin(){
        setImage("coin/coin_1.png");
    }
    public void act() 
    {
        // Add your action code here.
        gerenciaImagem(getWorldOfType(Lvl1.class));
        gerenciaDescida();
        gerenciaClick();
        //turn(5);
        coinSaiDeCena();
    }
    
     private void gerenciaImagem(Lvl1 mundo){
        
            setImage("coin/coin_" + passo + ".png");
          

        if ((mundo.getCiclo()%10)==0){

            passo++;
            if (passo==6){
                passo=1;
            }
        }

    }
    
    private void gerenciaDescida(){
        if ((getWorldOfType(Lvl1.class).getCiclo()%4)==0){
            setLocation(getX(),getY()+6);
        }

    }
    
     private void coinSaiDeCena(){
        if (getY()==499 && !clickado) {
            getWorld().removeObject(this);
        }
        else if (clickado){
                getWorld().removeObject(this);
            }
    }
    
      private void gerenciaClick(){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("coin.wav");
            Lvl1 mundo = getWorldOfType(Lvl1.class);
            
            mundo.addScore(100);
            clickado = true;
           
        }

    }
}
