/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaarrays;

/**
 *
 * @author Obadiah
 */
public class factorial {
 public static void main(String[] args) {

    	//We will find the factorial of this number
        int number = 5;
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}