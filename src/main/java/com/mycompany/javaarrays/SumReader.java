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
public class SumReader {
    
    public static void main(String[] args){
        int x,y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the First Number:");
         x = scanner.nextInt();
         System.out.println("Please Enter the Second Number:");
         y = scanner.nextInt();
         scanner.close();
         z = x+y;
         System.out.print("The sum of "+x +" and "+ y+"is "+z);
    }
}
