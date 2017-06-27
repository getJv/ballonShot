import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    
    
    public HiScoreBoard(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        
       
        
        //ranking.add(score);
        
        int u=0;
        //for(Integer pontuacao: ranking){
            
             
             //fundo.drawString(String.valueOf(pontuacao),100,50+u );
          //   u+=30;   
           
       // }
        board = new Ator();
        //board.setImage(fundo);
        
        addObject(board, getWidth()/2, getHeight()/2);
        
    }
    
   
}
