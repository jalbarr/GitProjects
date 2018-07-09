import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficControl extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TrafficControl()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(633, 634, 1);
        Car car = new Car();
        addObject(car, 45, 344);
    }
}
