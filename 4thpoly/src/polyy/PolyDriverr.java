/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyy;

import java.util.Scanner;

/**
 *
 * @author S542301
 */
public class PolyDriverr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the name of the event: ");
        String NameOfEvent=s1.next();
        System.out.print("Enter the number of people: ");
        int noOfPeople=s1.nextInt();
        System.out.print("Enter the number of items made: ");
        int itemsMade=s1.nextInt();
        
        System.out.print("Enter the type of event: ");
        String typeOfEvent=s1.next();
        
        Events V=new StudyRelated(typeOfEvent, "wedding",200,50);
        
        System.out.print("Enter number of hours: ");
        int noOfHours=s1.nextInt();
        
        System.out.println("Enter name of festival : ");
        String nameOfFestival = s1.next();
        
        Events X= new Festive(nameOfFestival, noOfHours,"december", NameOfEvent,noOfPeople, itemsMade);
        System.out.println(V.toString());
        
        System.out.print("Name of the event: ");
        System.out.println(X.getNameOfEvent());
        
        System.out.print("The number of people attended: ");
        System.out.println(X.getNoOfPeople());
        
        
        
        System.out.print("The type of event : ");
        System.out.println(V.TypeOfEvent());
        
        
    }
    
}

   
    
