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
    private int pontuacao = 0;
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
    
    public int getScore(){
        return pontuacao;
    }
    
    private void atualizaImagem(int valor ){

        GreenfootImage placar = new GreenfootImage(converteNumero(valor),30,Color.WHITE,new Color(0,0,0,0),Color.BLACK);
        setImage(placar);

    }

    private String converteNumero(int valor){

        return String.format("%010d",valor);

    } 

}
