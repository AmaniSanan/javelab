/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import static oop1.o12.sum;

/**
 *
 * @author KH
 */
public class o13 {
      static int sumood(int i){
         int  sum=0;
if (i>0 ){
   for (int a=1;a<=i;a++){
    if (a%2==1){
    sum+=a;
    }
   }
return sum;}
        
else {
return 0;
}

} 
      public static void main(String[] args) {
       System.out.println(sumood(5));
       System.out.println(sumood(2));
    
    }
}
