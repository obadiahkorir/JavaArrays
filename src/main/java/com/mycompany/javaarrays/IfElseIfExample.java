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
public class IfElseIfExample {
    
public static void main(String args[]){
	int num=1234;
	if(num <100 && num>=1) {
	  System.out.println("Its a two digit number");
	}
	else if(num <1000 && num>=100) {
	  System.out.println("Its a three digit number");
	}
	else if(num <10000 && num>=1000) {
	  System.out.println("Its a four digit number");
	}
	else if(num <100000 && num>=10000) {
	  System.out.println("Its a five digit number");			
	}
	else {
	  System.out.println("number is not between 1 & 99999");			
	}
   }
}