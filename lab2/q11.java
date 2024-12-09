/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;


public class q11 {
 public static void main(String[] args) {
           int num[]={1,2,3,4};
       Scanner x=new Scanner(System.in);
       int xx=x.nextInt();
       
     try{
         System.out.println(num[xx]);
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println("error ");
     }
    }   
}
