/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

/**
 *
 * @author S542301
 */
public interface Worm {
    
    
    double centreDistance();
    
    
    default double diaPitch( int numOfTeeth){
        double circularPitch=3.14/numOfTeeth;
        return circularPitch;
        
    }


    
}
