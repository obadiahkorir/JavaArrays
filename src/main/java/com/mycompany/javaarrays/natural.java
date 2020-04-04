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
public class natural {
    
  public static void main(String[] args) {

       int num = 10, count = 1, total = 0;

       while(count <= num)
       {
           total = total + count;
           count++;
       }

       System.out.println("Sum of first 10 natural numbers is: "+total);
    }
}