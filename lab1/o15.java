/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;


public class o15 {
  static int countvowal(String word){
  int count=0;
  String s=word.toLowerCase();
  for (int i=0;i<word.length();i++){
      char ch= word.charAt(i);
  if (ch=='a' || ch=='e' || ch=='u' || ch=='o' || ch=='i')
      count+=1;
  
  }
      return count;
  }
   public static void main(String[] args) {
       System.out.println(countvowal("aeaeaeaeae"));
    
    }
}
