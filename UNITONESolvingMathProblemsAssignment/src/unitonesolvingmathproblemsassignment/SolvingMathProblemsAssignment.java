/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitonesolvingmathproblemsassignment;

import java.util.Scanner;

public class SolvingMathProblemsAssignment {

  
    
    public static void main(String[] args) {
    
        Scanner keyedinput=new Scanner(System.in);
        
 //Variables 
        double length;
        double width;
        double area;

    
 // Commands for user 
        System.out.println("Please enter the length of the rectangle");
        length= keyedinput.nextDouble();
        
        System.out.println("Now please enter the width of the rectangle");
        width= keyedinput.nextDouble();
        
        area= length * width;
        
        System.out.println("The area of the rectangle is " +area);
        
        System.out.println("Hello boo");
        
        
        
        
        
    }
    
}
