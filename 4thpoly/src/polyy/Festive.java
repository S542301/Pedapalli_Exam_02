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
public class Festive extends Events{
    private String nameOfFestival;
    private int noOfHours;
    private String month;

    public Festive(String nameOfFestival, int noOfHours, String month, String NameOfEvent, int noOfPeople, int itemsMade) {
        super(NameOfEvent, noOfPeople, itemsMade);
        this.nameOfFestival = nameOfFestival;
        this.noOfHours = noOfHours;
        this.month = month;
    }

    public String getNameOfFestival() {
        return nameOfFestival;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public String getMonth() {
        return month;
    }
    

    public double moneySpent(){
        int rate= 5;
        double spentmoney = rate * noOfHours;
        return spentmoney;
    }
    
    @Override
     public String toString(){
         return super.toString()+ "\nmoney spent : "+ moneySpent(); 
               
                 
     }

}
