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
public  class Utility implements Gas, Electricty {
    
    private double billAmount;
    private double units;
    private double marketPrice;

    public Utility(double billAmount, double units, double marketPrice) {
        this.billAmount = billAmount;
        this.units = units;
        this.marketPrice = marketPrice;
    }

    public double getUnits() {
        return units;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    

   

    public double getBillAmount() {
        return billAmount;
    }
    
    
   
    @Override
    public double calcdiscount(int marketprice,int discountrate){
        double discount = (marketprice * discountrate);
        return discount;   
    }
    
   
    @Override
     public  double cost(int units, int time){
        double cost = (time*units);
        return cost;   
    }

    @Override
     public double unitPrice(){
         double packagePrice =(billAmount * 2);
         return packagePrice;
     }
    
    @Override
     public double unitsConsumed(){
         return (billAmount/5);
         
     }
    

}

