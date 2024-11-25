/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

public class o12 {
  static int sum(int i){
if (i>0){

return i+sum(i-1);}

else {
return 0;
}

} 
   public static void main(String[] args) {
       System.out.println(sum(5));
       System.out.println(sum(3));
    
    }
}
