
package com.mycompany.icetask9;
import java.util.*;
/**
 *
 * @author RC_Student_lab
 */
public class ICETask9 {

    public static void main(String[] args) {
        //Declare variables
        int value;
        int value2;
        int results = 0;
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        value = myObj.nextInt();
        
        System.out.println("Enter second number: ");
        value2 = myObj.nextInt();
        
        System.out.println("=============Menu==============");
        System.out.println("(1) Addition");
        System.out.println("(2) Subtraction");
        System.out.println("(3) Multiplication");
        System.out.println("(4) Division");
        
        System.out.print("Enter option number: ");
        int option;
        option = myObj.nextInt();
        
        
        while(option != 0){
           
           switch(option){
                case 1 -> results = value + value2;
                case 2 -> results = value - value2;
                case 3 -> results = value * value2;
                case 4 -> results = value/value2;
                default -> System.out.println("Calculation not recognized");
                
            }
             
       }
        System.out.println("Your results are: "+ results);
    }
}
