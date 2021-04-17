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
public class HolyBookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(HolyBook.BIBLE.getPrice());
        
        for(HolyBook a:HolyBook.values() )
        {
            System.out.println(a + " price is: "+ a.getPrice()+ " dollars."  + "\nReligion is: "+a.getReligion());
        }
    }
}

            
            
            
            
       
