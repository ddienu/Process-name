/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegonunez.processname;

import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        //Instance the scanner.
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        
        String name = console.nextLine();
        
        //Variable initial to save the first letter of the name.
        char initial = name.charAt(0);
        
        /*Variable blankSpace to get the data of the blank between name and last name
        to know where's the last name begins.*/
        int blankSpace = name.indexOf(" ");
        
        System.out.println(blankSpace);
        /*Variable lastName to create a subString of the name to get the last name
        using the blankSpace*/
        String lastName = name.substring(blankSpace);
        //Print the last name with the initial letter of the name.
        System.out.println("Your name is: "+lastName+", "+initial+".");
        
    }//End Main.
}//End Class.