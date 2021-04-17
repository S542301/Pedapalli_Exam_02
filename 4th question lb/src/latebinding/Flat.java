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
public class Flat  extends Apartment{
    
    private final int numOfRooms;
    private final int cost;

    public Flat(int numOfRooms, int cost, String typeOfApartment, String owner, String location, int noOfYearsBuilt, double rent) {
        super(typeOfApartment, owner, location, noOfYearsBuilt, rent);
        this.numOfRooms = numOfRooms;
        this.cost = cost;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getCost() {
        return cost;
    }
    
    
    public int totalCost(){
        return numOfRooms*cost;
    }
    
    
    @Override
    public String isGainingProfit(){
        if(numOfRooms>10){
            return "seller is gaining more money today";
            
        }
        else if(numOfRooms<=5){
            return "seller is not gaining money today";
        }
        else
            return "number ";
    }

    @Override
    public String toString() {
        return super.toString()+"\nnumber of numOfRooms: " + numOfRooms + "\ncost: " + cost+
                "\ntotal money gained: "+totalCost()+
                "\nwhether gaining profit : "+isGainingProfit();
                        
    }
    
    
    
}



    

