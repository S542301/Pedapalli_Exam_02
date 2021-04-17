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
public class StudyRelated extends Events{
    private String TypeOfEvent;

    public StudyRelated(String TypeOfEvent, String NameOfEvent, int noOfPeople, int itemsMade) {
        super(NameOfEvent, noOfPeople, itemsMade);
        this.TypeOfEvent = TypeOfEvent;
    }

    public String getTypeOfEvent() {
        return TypeOfEvent;
    }
    
    
       
    @Override
   public String TypeOfEvent(){
        switch (TypeOfEvent) {
            case "Seminars":
                return "on coding";
            case "conference":
                return "bio medical ";
            default:
                return "mechanical";
        }

    
   }
}
