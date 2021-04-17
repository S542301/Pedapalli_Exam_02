/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherita;

/**
 *
 * @author S542301
 */
public class Pastry extends Cakes {
    private int quantity;
    private double costOfEachCake;

    public Pastry(int quantity, double costOfEachCake, String customerName, String cakeName) {
        super(customerName, cakeName);
        this.quantity = quantity;
        this.costOfEachCake = costOfEachCake;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
**/
    
    public double getCostOfEachCake() {
        return costOfEachCake;
    }

   /**
    * public void setCostOfEachCake(double costOfEachCake) {
        this.costOfEachCake = costOfEachCake;
    }
    * */
    
    
    public double totalCost(){
        double cost=quantity*costOfEachCake;
        return cost;
        
    }
    
    
    

    

    
}
