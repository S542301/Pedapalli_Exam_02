/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

/**
 *
 * @author S542301
 */
public interface Electricty {
    
    double unitsConsumed();
    
    // a= units consumed 
    //b= time
    
    
    default double cost(int units, int time){
        double timeInSec =time%3600;
        return timeInSec;   
    }

      

    
    
    
    
    
    
}
