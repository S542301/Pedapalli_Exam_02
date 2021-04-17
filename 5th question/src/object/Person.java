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
public class Person {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getEmailAddress() {
        return emailAddress;
    }
  
    public String getFirstLetter(){
        return name.substring(0);
    }
    @Override
    public String toString() {
        return "Person: "+ "\n name: " + name + "\naddress: " + address + "\nphone number: " + phoneNumber + "\nemail address: " + emailAddress 
                +"\nfirst letter: "+getFirstLetter();
    }
    

    
    
    
    
}
