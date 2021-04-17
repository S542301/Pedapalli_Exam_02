/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author swarupa pedapalli
 */
public class Duplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        String s2 = s1.nextLine();
        String arr[] = s2.split(" ", 10);
        ArrayList<Integer> list = new ArrayList<>();
        for(int x = 0; x<arr.length;x++){
            int y = Integer.parseInt(arr[x]);
            list.add(y);
        }
        removeDuplicate(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> distinct = new ArrayList<>();
        for(int x =0; x<list.size();x++){
           if(distinct.contains(list.get(x))){
               
           }
           else{
               distinct.add(list.get(x));
           }
              
       }
        System.out.println("The distinct integers are " +distinct.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}