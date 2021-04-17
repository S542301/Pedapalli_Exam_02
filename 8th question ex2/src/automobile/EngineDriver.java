/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

import java.util.Scanner;

/**
 *
 * @author S542301
 */
public class EngineDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the length : ");       
        double length=s1.nextDouble();
        System.out.print("Enter the power: ");
        double power=s1.nextDouble();
        System.out.print("Enter acceleration: ");
        double acc = s1.nextDouble();
        System.out.print("Enter speed: ");
        double rpm=s1.nextDouble();   
        System.out.print("Enter the horse power: ");
        double HP=s1.nextDouble();
        System.out.print("Enter the length of 4stroke: ");
        double len=s1.nextDouble();
       System.out.print("Enter the crankshaft speeed: ");
        double crankShaftSpeed=s1.nextDouble();
        
        Engine s2=new TwoStroke( length, power,acc,rpm,HP);
        System.out.println(s2.toString());
        
        Engine s3 =new FourStroke(len,  crankShaftSpeed,  power,  acc,rpm,HP);
           System.out.println(s3.toString());
    }

    }
    

