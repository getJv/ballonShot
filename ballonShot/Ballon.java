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
    public boolean estourado = false;
    public Lvl1 mundo;
    
    public Ballon(){
        setImage("ballon/ballon0.png");
    }

    public void act() 
    {
        // Add your action code here.

        gerenciaSubida();
        
        gerenciaClick();
        gerenciaImagem(getWorldOfType(Lvl1.class));
        balaoSaiDeCena();//você tem que ser o útimo método a ser executado, por que
        // ninguem gosta de você !

        
    }

    private void gerenciaClick(){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("ploc.wav");
            mundo = getWorldOfType(Lvl1.class);
            mundo.addScore(100);
            estourado = true;
            passo = 1;
        }

    }

    private void balaoSaiDeCena(){
        if (getY()==0 && !estourado) {
            getWorld().removeObject(this);
        }
        else if (passo==4 && estourado){
                getWorld().removeObject(this);
            }
    }

    private void gerenciaImagem(Lvl1 mundo){

        if (estourado){
            
            
            setImage("ballonExplode/ballonExplode" + passo + ".png");
          
        }
        else {
            setImage("ballon/ballon" + passo + ".png");
        }

        if ((mundo.getCiclo()%15)==0){

            passo++;
            if (passo==6){
                passo=1;
            }
        }

    }

    private void gerenciaSubida(){
        if ((getWorldOfType(Lvl1.class).getCiclo()%4)==0){
            setLocation(getX(),getY()-6);
        }

    }

}
