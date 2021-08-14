/*
 * Shane Fox 8/14/2021
 * Module 1 Assignment
 * Create a class for Fan, provide default values and create two test methods.
 */

public class FanTest {
    public static void main(String[] args) {
    // Constants used to define speed
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;        
        
        // Test creation
        Fan Fan1 = new Fan();
        System.out.println(Fan1.toString());
        
        Fan Fan2 = new Fan();
        Fan2.setSpeed(MEDIUM);
	Fan2.setRadius(5);
	Fan2.setColor("blue");
	Fan2.turnOn();
        System.out.println(Fan2.toString());
 }    
}

//Define Fan as a class.
class Fan{
    private int speed;
    private boolean on;
    private double radius;
    String color;
    
    // Constants used to define speed
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    // No-arguement constructor
    Fan(){
    // Need default for speed = Stopped, Radius = 6, and Color = White.        
        speed = STOPPED;
        on = false;
        color = "White";
        radius = 6;
    }
    
    // Mutator methods
    // Sets speed
    public void setSpeed(int newSpeed) {
	speed = newSpeed;
    }

    // Sets fan on
    public void turnOn() {
	on = true;
    }

    // Sets fan off 
    public void turnOff() {
	on = false;
        speed = STOPPED;
    }

    // Sets color
    public void setColor(String newColor) {
    	color = newColor;
    }

    // Sets radius
    public void setRadius(double newRadius) {
	radius = newRadius;
    }
	
    // Accessor methods
    // Return speed
    public int getSpeed() {
	int s = speed;
        return s;
    }

    // Return on
    public boolean isOn() {
        return on;
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Return color
    public String getColor() {
	return color;
    }

    // ToString method
    public String toString() {
        if (isOn() == true) {
            return "\nThe " + getColor() + " fan with a radius of " + getRadius() +
                    " inches is on. It's speed is set to " + getSpeed() + ".";
    }
	else{
            return "\nThe " + getColor() + " fan with a radius of " + getRadius() +
                    " inches is off. It's speed is set to " + getSpeed() + ".";
  }
 }
}