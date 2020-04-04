/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaarrays;

import java.util.Scanner;

/**
 *
 * @author Obadiah
 */
public class Reads {
    
    public static void main(String[] args){
       
        Scanner scanner = new Scanner (System.in);
         System.out.println("Enter your Name:");
         String name = scanner.nextLine();
          System.out.print("My name is :"+name);
    }
    
}
