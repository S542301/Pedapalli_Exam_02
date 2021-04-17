/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyy;

/**
 *
 * @author S542301
 */
public class Events {
    private String NameOfEvent;
    private int noOfPeople;
    private int itemsMade;

    public Events(String NameOfEvent, int noOfPeople, int itemsMade) {
        this.NameOfEvent = NameOfEvent;
        this.noOfPeople = noOfPeople;
        this.itemsMade = itemsMade;
    }

    public String getNameOfEvent() {
        return NameOfEvent;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public int getItemsMade() {
        return itemsMade;
    }
    
  
   

     @Override
    public String toString() {
        return "Name of event organized : " + NameOfEvent +"\n"+
                "no of people attended: " + noOfPeople;
    }

    
    public String TypeOfEvent(){
      return "Techincal";
           

    
    
    }


    
}
