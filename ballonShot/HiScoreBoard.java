import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;  
/**
 * Write a description of class HiScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiScoreBoard extends World
{

    /**
     * Constructor for objects of class HiScoreBoard.
     * 
     */
    public Actor board;
    public List<Integer> ranking = new ArrayList();
    
    
    public HiScoreBoard(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        GreenfootImage fundo = new GreenfootImage(300,200);
        fundo.setColor(new Color(0,0,0,150));
        fundo.fill();
       
        
        ranking.add(score);
        
        int u=0;
        for(Integer pontuacao: ranking){
            
             
             fundo.drawString(String.valueOf(pontuacao),100,50+u );
             u+=30;   
           
        }
        board = new Ator();
        board.setImage(fundo);
        Replay replay = new Replay();
        addObject(replay, 306, 406);
        addObject(board, getWidth()/2, getHeight()/2);
        
    }
    
   
}
