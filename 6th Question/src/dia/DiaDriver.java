/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia;

import java.util.Scanner;

/**
 *
 * @author S542301
 */
public class DiaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the first side of triangle: ");
        double ones=s1.nextDouble();
        System.out.print("Enter the second side of triangle: ");
        double twos=s1.nextDouble();
        System.out.print("Enter the third side of triangle: ");
        double threes=s1.nextDouble();
        System.out.print("Enter whether filled or not: ");
        String filling=s1.next();
        
        GeometricObject s2=new Triangle(ones,  twos,  threes,filling,"Triangle",  "red");
        System.out.println(s2.toString());
        
    }
    
}

    
    

