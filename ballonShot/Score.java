import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Ator
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int pontuacao = 0;
    public Score (){
        
        atualizaImagem(pontuacao);
    }

    public void act() 
    {
        // Add your action code here.
        atualizaImagem(pontuacao);
        //setImage("");
    }

    public void addScore(int score){
        pontuacao += score;        
    }

    private void atualizaImagem(int valor ){

        GreenfootImage placar = new GreenfootImage(converteNumero(valor),24,Color.WHITE,new Color(0,0,0,0),Color.BLACK);
        setImage(placar);

    }

    private String converteNumero(int valor){

        return String.format("%010d",valor);

    } 

}
