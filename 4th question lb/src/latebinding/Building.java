/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latebinding;

/**
 *
 * @author S542301
 */
public class Building {
    
    private String owner;
    private String location;
    private int noOfYearsBuilt;
    private double rent;

    public Building(String owner, String location, int noOfYearsBuilt, double rent) {
        this.owner = owner;
        this.location = location;
        this.noOfYearsBuilt = noOfYearsBuilt;
        this.rent = rent;
    }

    

    public String getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }

    public int getNoOfYearsBuilt() {
        return noOfYearsBuilt;
        
    }

    public double getRent() {
        return rent;
    }
    
    
    public String isGainingProfit(){
        if (rent > 6000){
            return "gaining more profit";
        }
        else{
            return "not good profit" ;
                 
        }
    } 
      public String building(String buildingName){
            return buildingName.substring(0, 2);
        }
    
    @Override
    public String toString() {
        return "owner: " + owner + "\nlocation: " + location +"\rent: " + rent;
    }




    
}
