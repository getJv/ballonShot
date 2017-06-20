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
    public HiScoreBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        GreenfootImage fundo = new GreenfootImage(300,200);
        fundo.setColor(new Color(0,0,0,150));
        fundo.fill();
        
        board = new Ator();
        board.setImage(fundo);
        addObject(board, getWidth()/2, getHeight()/2);
        
        
        
        
        
        
        
        
        
    }
}
