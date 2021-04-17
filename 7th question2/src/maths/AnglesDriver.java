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
public class AnglesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The acute is of "+Angles.ACUTE.getDirection()+" direction");
        System.out.println("The angle of obtuse is "+Angles.OBTUSE.getDegrees()+"degrees");
        System.out.println("Right angle degree converted to radians: "+Angles.RIGHTANGLE.getRadians()+"rad");
        
    }
    
    
}
