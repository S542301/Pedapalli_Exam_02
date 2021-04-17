/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherita;

import java.util.Scanner;

/**
 *
 * @author S542301
 */
public class PolyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter DryFruits: ");
        int DryFruits =s1.nextInt();
        System.out.print("Enter price: ");
        double price =s1.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity=s1.nextInt();
        System.out.print("Enter cost of each cake: ");
        double costOfEachCake=s1.nextDouble();
        System.out.print("Enter customer name: ");
        String customerName=s1.next();
        System.out.println("Enter the name of cake for another customer: ");
        String cakeName=s1.next();
        Pastry s2=new Pastry( quantity,costOfEachCake,"Swa",cakeName);
        Muffins s3= new Muffins(DryFruits,price,quantity,costOfEachCake,customerName,"biscuit");   
        System.out.println(s2.toString());
        System.out.println("Second customer: "); 
        System.out.println(s3.toString());
        

        
        
        
    }
    
}

    

