/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author KH
 */
public class q12 {
    

public static void shuffle(int[] A) {
    Random rnd = new Random();

    for (int i = A.length - 1; i > 0; i--) {
        // Swap the current element with a randomly chosen element from the remaining array
        int j = rnd.nextInt(i + 1);
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}


}
