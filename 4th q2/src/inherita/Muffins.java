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
public class Muffins extends Pastry{
    private int isDryFruits;
    private double price;

    public Muffins(int isDryFruits, double price, int quantity, double costOfEachCake, String customerName, String cakeName) {
        super(quantity, costOfEachCake, customerName, cakeName);
        this.isDryFruits = isDryFruits;
        this.price = price;
    }

    public int getIsFruits() {
        return isDryFruits;
    }

    public void setIsFruits(int isDryFruits) {
        this.isDryFruits = isDryFruits;
    }

    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean DryFruits(){
       if (isDryFruits != 0) {
           return true;
       }
           else {
                   return false;
                   }   
       }
      
    @Override
    public double totalCost(){    
    double cost=0.0;
       cost =super.getQuantity()*price;
        return cost; 
       }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "total cost of cake: "+ totalCost()+"\n"+
                "if dryfruits are present in Muffins: "+ DryFruits();
        
    }
      
    
       
}
          

    
    
