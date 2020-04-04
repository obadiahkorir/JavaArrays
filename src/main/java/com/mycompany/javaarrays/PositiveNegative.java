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
public class PositiveNegative {
    
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter A number to Check whether it is Positive:");
         int number = scanner.nextInt();
         
         if(number>0){
             System.out.println(number+": Is a positive Number");
         }
         else if(number<0){
             System.out.println(number+": Is a Negative Number");
         }else{
           System.out.println(number+": Is neither Negative Nor Positive");
         }
         
    }
}
