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
public class Umld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person s1 = new Person("Swa","Maryville","9441791966","abcd@gmail.com");
        System.out.println("\n"+s1); 
        
        Student s2 = new Student("A","Rupa","Guntur","9234543503","abcd@gmail.com");
        System.out.println("\n"+s2);        
        
        Employee s3 = new Employee("Tcs",5000.0,"01/01/2012","Tom","Newyork","1234564768","xyz@gmail.com");
        System.out.println("\n"+s3); 
        
        Faculty s4 = new Faculty(10,5,"Infosys",2500.0,"04/21/2015","Jerry","Newjersey","6748938092","nwm@gmail.com");
        System.out.println("\n"+s4);
        
        Staff s5 = new Staff("Phd","Wipro",3000.0,"12/12/1994","Kid","Hyd","100","pqrs@gmail.com");
        System.out.println("\n"+s5);       
    }
    
}
