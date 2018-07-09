import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int speed;
    private CarState currentState;
    
    public Car() {
        speed = 1;
        currentState = CarState.MEDIUM;
    }
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            MouseInfo mouseInfo = Greenfoot.getMouseInfo();
            int buttonNumber = mouseInfo.getButton();
            
            if (currentState == CarState.STOP) {
                if (buttonNumber == 3){
                    speed += 1;
                    currentState = CarState.MEDIUM;
                }
            } else if (currentState == CarState.MEDIUM) {
                if (buttonNumber == 1) {
                    speed -= 1;
                    currentState = CarState.STOP;
                } else if (buttonNumber == 3){
                speed += 1;
                currentState = CarState.FAST;
                }
            } else if (currentState == CarState.FAST) {
                if (buttonNumber == 1) {
                    speed -= 1;
                    currentState = CarState.MEDIUM;
                }
            }
        }
        move(speed);
    }    
}
