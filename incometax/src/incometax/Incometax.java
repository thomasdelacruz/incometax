/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometax;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Incometax {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in); 

        double taxrate = 5.05;
        double income;
        double incometax;


        
          
       
        System.out.println("Type income");
        income = scan.nextDouble();
        
        System.out.println("Your income tax is" + (income / 100)* taxrate + income);
            
 
       
        
        
        // TODO code application logic here
    }
    
}
