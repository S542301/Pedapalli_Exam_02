/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constant;

/**
 *
 * @author S542301
 */
public enum HolyBook {
    BIBLE(50.00,"CHRISTIANITY"),
    QURAN(49.00,"MUSLIMS"),
    GITA(48.50,"HINDUS");
   
    
    
    private final double price;
    private final String Religion;

    private HolyBook(double price, String Religion) {
        this.price = price;
        this.Religion = Religion;
    }

    

    public double getPrice() {
        return price;
    }

    public String getReligion() {
        return Religion;
    }
    
    
}


   
