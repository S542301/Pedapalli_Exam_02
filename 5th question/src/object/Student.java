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
public class Student extends Person {
    private final String grade;
    private final String status="Graduate";    

    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    

    
    public String getGrade() {
        return grade;
    }

    public String getStatus() {
        return status;
    }

   
    @Override
    public String getFirstLetter(){
        return super.getName().substring(0,1);
    }


    @Override
    public String toString() {
        return "Student: "+"\n name: "+super.getName()+ "\ngrade:" + grade+
                "\nstatus: "+status+
                "\nfirst letter: "+getFirstLetter();
    }
    
    

    
}
   
   
