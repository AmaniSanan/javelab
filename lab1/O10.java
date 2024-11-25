/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author KH
 */
public class O10 {
     static boolean ismultiple(long n,long m){
     return m!=0 && n%m==0;
     }
     public static void main(String[] args) {
         System.out.println(ismultiple(10,2));   
         System.out.println(ismultiple(10,3));
         System.out.println(ismultiple(10,0));
    
    }
}
