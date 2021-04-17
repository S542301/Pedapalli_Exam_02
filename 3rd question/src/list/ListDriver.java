/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author swarupa pedapalli
 */
public class ListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> loans = new ArrayList<>();
        Date s1 = new Date();
        Circle s2 = new Circle(15.4, 9.6);
        Loan s3 = new Loan("rupa", 32.2, 67.9);
        String name = "Pedapalli";
        loans.add(s3);
        loans.add(s2);
        loans.add(s1);
        loans.add(name);
        for (Object s : loans) {
            System.out.println(s.toString().replace("[", "").replace("]", ""));
        }
    }
    }
    

