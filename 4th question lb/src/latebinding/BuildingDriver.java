/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latebinding;

import java.util.Scanner;

/**
 *
 * @author S542301
 */
public class BuildingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the number of rooms : ");
        int numOfRooms=s1.nextInt();
        System.out.print("Enter the cost : ");
        int cost=s1.nextInt();
        System.out.print("Enter the type of apartment: ");
        String typeOfApartment=s1.next();
        
        //System.out.print("Enter the name of owner: ");
        //String owner=s1.next();
        
          System.out.print("Enter the location: ");
        String location=s1.next();
          System.out.print("Enter the noOfYearsBuilt: ");
        int noOfYearsBuilt=s1.nextInt();
        
        System.out.print("Enter the rent: ");
        int rent=s1.nextInt();
        
        Building dr =new Flat( numOfRooms, cost,typeOfApartment, "swarupa","location", noOfYearsBuilt,rent);
        
        System.out.println(dr.toString());

    }
    
}
