import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;  
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends Ator
{
    /**
     * Act - do whatever the Board wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage fundo;
    public List<Integer> ranking = new ArrayList();
    Replay replay = new Replay();
    private static Board bobo;
    
    private Board(){
       gerenciaImagemFundo();
       
       setImage(fundo);
    }
    
    public void act() 
    {
        // Add your action code here.
        montaRanking();
        getWorld().addObject(replay, 306, 406);
    }
    
    public static Board getBoard(){
        if (bobo == null){
            bobo = new Board();
        }
        
           return bobo;
        
    }
    
    public void adicionaHiBoard(int score){
        ranking.add(score);
    }
    
    public void montaRanking(){
    
        int u=0;
        for(Integer pontuacao: ranking){
            
             
             GreenfootImage i = new GreenfootImage(String.valueOf(pontuacao), 20, Color.WHITE, Color.BLACK);
             fundo.drawImage(i,100,50+u );
             u+=30;   
           
        }
    }
    
    private void gerenciaImagemFundo(){
        fundo = new GreenfootImage(300,200);
        fundo.setColor(new Color(0,0,0,100));
        fundo.fill();
        
    
    }
}
