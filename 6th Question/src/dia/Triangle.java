/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia;

/**
 *
 * @author S542301
 */
public class Triangle extends GeometricObject{
    private final double ones;
    private final double twos;
    private final double threes;
    private String filling;

    public Triangle(double ones, double twos, double threes, String filling, String objectName, String color) {
        super(objectName, color);
        this.ones = ones;
        this.twos = twos;
        this.threes = threes;
        this.filling = filling;
    }

    public double getOnes() {
        return ones;
    }

    public double getTwos() {
        return twos;
    }

    public double getThrees() {
        return threes;
    }

    public String getFilling() {
        return filling;
    }

    
   

    


   
    
    @Override
    public boolean isFilled() {
               if(filling.equals("filled")){
            return true;
        }
        else
            return false;
    }

    

    @Override
    public double perimeterOfTriangle() {
        double perimeter=ones+twos+threes;
        return perimeter;
    }
    @Override
    public double areaOfTriangle() {
        double x= perimeterOfTriangle()*((perimeterOfTriangle()-ones)*(perimeterOfTriangle()-twos)*(perimeterOfTriangle()-threes));
        double area=Math.sqrt(x);
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\n    first side of a triangle is: " + ones + "\n    second side of a triangle is: " + twos 
                + "\n    third side of a triangle is: " + threes + 
                "\n    whether the triangle is filled: "+isFilled()+
                "\n    Area of a triangle: "+areaOfTriangle()+
                "\n    Perimeter of the triangle: "+perimeterOfTriangle();
    }
    
    
    
    
}

