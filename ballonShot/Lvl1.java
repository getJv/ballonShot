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
    public Score placar;
    public Lvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        placar = new Score();
        addObject(placar, 540, 24);
    }

    public void act(){
        
        gerenciarEntradaBalao();   
        ciclo++;
        
        if (ciclo==1000){
            ciclo = 1;
        }
     
    }

    public void gerenciarEntradaBalao(){

        if (getCiclo()%50==0){
            int x = Greenfoot.getRandomNumber(500) + 50;
            addObject(new Ballon(), x, 430);

        }

    
    }
    public int getCiclo(){
        return ciclo;
    }
    
    public void addScore(int score){
        placar.addScore(score);
    }
}
