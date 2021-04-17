/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.util.Scanner;

/**
 *
 * @author S542301
 */
public class UtilDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the billAmount: ");
        int billAmount= s1.nextInt();
        System.out.print("Enter the marketprice: ");
        double marketprice=s1.nextDouble();
        
        System.out.print("Enter the units: ");
        double units=s1.nextDouble();
        
        
        Utility s2 = new Utility (billAmount,units,marketprice);
        System.out.print("The calcdiscount is: ");
        System.out.println(s2.calcdiscount(35,2));
        System.out.print("The cost is: ");
        System.out.println(s2.cost(50,5));
        System.out.print("The unitPriceis: ");
        System.out.println(s2.unitPrice());
        System.out.print("The unitsConsumed is: ");
        System.out.println(s2.unitsConsumed());
        
        

    }
    
}
