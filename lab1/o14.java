/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;



public class o14 {
       static int sumsqrt(int i){
         int  sum=0;
if (i>0 ){
   for (int a=1;a<=i;a++){
       
       sum+=a*a;
    
   }
return sum;}
        
else {
return 0;
}}
public static void main(String[] args) {
       System.out.println(sumsqrt(6));
       System.out.println(sumsqrt(2));
    
    } } 

