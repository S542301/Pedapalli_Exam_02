/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author S542301
 */
public enum Angles {
    ACUTE(30,"NORTHWEST",0.52),
    RIGHTANGLE(90,"NORTH",1.57),
    OBTUSE(120,"NORTHWEST",2.09);
    
    
    private final int degrees;
    private final String direction;
    private final double radians;

    private Angles(int degrees, String direction, double radians) {
        this.degrees = degrees;
        this.direction = direction;
        this.radians = radians;
    }

    

    public int getDegrees() {
        return degrees;
    }

    public String getDirection() {
        return direction;
    }

    public double getRadians() {
        return radians;
    }
    
    
   
    
}

    

