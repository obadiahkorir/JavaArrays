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
public class natural2 {
    
public static void main(String[] args) {

       int num = 10, count, total = 0;

       for(count = 1; count <= num; count++){
           total = total + count;
       }

       System.out.println("Sum of first 10 natural numbers is: "+total);
    }
}
