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
    public Lvl1 mundo;
    public int passo = 1;    
    public boolean clickado = false;
    public Life vida;

    public void act() 
    {
        // Add your action code here.
        setImage("bomb/1.png");
        gerenciaClick();
        gerenciaDescida();
        gerenciaImagem(getWorldOfType(Lvl1.class));

        bombaSaiDeCena();
    }

    private void gerenciaImagem(Lvl1 mundo){

        if (clickado){

            setImage("bomb/" + passo + ".png");
        }    
        if ((mundo.getCiclo()%2)==0 && (passo <= 12)){
            passo++;
            
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

    private void gerenciaClick(){
        if (Greenfoot.mouseClicked(this) && !clickado){          

            Greenfoot.playSound("syntetic-bomb.wav");
            mundo = getWorldOfType(Lvl1.class);

            mundo.addScore(-200);
            mundo.removeLifeOfScenario();
            

            clickado = true;
            passo = 1;

        }
    }
}
