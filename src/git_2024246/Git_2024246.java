/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024246;

import java.util.Scanner;

/**
 *
 * @author Magnow
 */
public class Git_2024246 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            //Outputting the name and the student ID
            System.out.println("Magnun Mariano - 2024246");
        
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Declaring an integer variable to store the user's input
        int myKb;  
        
        // Using while loop that runs until an even number is entered
        while (true) {  
            // Prompt user to input
            System.out.print("Enter an even number: ");  
            // Read user input and store it in 'num'
            myKb = scanner.nextInt();  

            // Checking if the number is even
            if (myKb % 2 == 0) {  
                // outputing confirmation message
                System.out.println("Thank you! number " + myKb + " is even.");  
                
                // Exit the loop since the condition is met
                break; 
            
            // If the number is not even
            } else {  
                System.out.println("Sorry," + myKb + " is not even. Please, try again."); 
            }
        }

        scanner.close();
    }
    
}
