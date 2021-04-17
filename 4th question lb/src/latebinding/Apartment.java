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
public class Apartment extends Building {
    private String typeOfApartment;

    public Apartment(String typeOfApartment, String owner, String location, int noOfYearsBuilt, double rent) {
        super(owner, location, noOfYearsBuilt, rent);
        this.typeOfApartment = typeOfApartment;
    }

    public String getTypeOfApartment() {
        return typeOfApartment;
    }
    
    
    @Override
    public String building(String buildingName){
        return buildingName.toLowerCase().trim();      
     }
    
    public String myBuilding(){
        String MyString=" ";
        if(typeOfApartment.equals("single storey")){
             MyString="house";
        }
         if(typeOfApartment.equals("10 floors")){
             MyString= "tower";
         }
         if(typeOfApartment.equals("hut")){
             MyString= "Not apartment";
            
        } 
        return MyString;
    }

    @Override
    public String toString() {
        return  super.toString()+"\ntypeOfApartment: " + typeOfApartment ;
    }
    
    
    
}
