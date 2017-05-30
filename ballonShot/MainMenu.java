import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Click click = new Click();
        addObject(click,283,290);
        click.setLocation(316,310);
        click.setLocation(335,275);
        click.setLocation(319,289);
        Logo logo = new Logo();
        addObject(logo,296,147);
        click.setLocation(301,302);
        logo.setLocation(302,144);
        click.setLocation(303,305);
        logo.setLocation(294,145);
    }
}
