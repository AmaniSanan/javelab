/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;


public class GameEntryo9 {
    int score;
    

    public GameEntryo9(int score) {
        this.score = score;
    }

     public static void main(String[] args) {
        GameEntryo9[] a =new GameEntryo9[5];
        for(int i=0; i<a.length;i++){
          a[i]=new GameEntryo9(i);
        }
         System.out.println(a[4].score);
        GameEntryo9 []b=a.clone();
        a[4].score=550;
         System.out.println(a[4].score); 
         System.out.println(b[4].score);
    }
}
