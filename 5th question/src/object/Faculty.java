/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author S542301
 */
public class Faculty extends Employee {
    private int officeHours ;
    private int numberOfTeachingSubjects ;

    public Faculty(int officeHours, int numberOfTeachingSubjects, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    
    

    public int getOfficeHours() {
        return officeHours;
    }

    public int getNumberOfTeachingSubjects() {
        return numberOfTeachingSubjects;
    }

   

   @Override
    public String toString() {
        return "Faculty: " + "\nPerson name: "+super.getName()+"\nofficeHours: " + officeHours + "\nnumberOfTeachingSubjects: " + numberOfTeachingSubjects;
    }
    

    
}
