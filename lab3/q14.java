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
public class q14 {
   
public static int[][] addThreeDimensionalArrays(int[][][] array1, int[][][] array2) {
  // Check if the arrays have the same dimensions
  if (array1.length != array2.length || array1[0].length != array2[0].length || array1[0][0].length != array2[0][0].length) {
    throw new IllegalArgumentException("Arrays must have the same dimensions");
  }

  // Create a new array to store the result
  int[][][] result = new int[array1.length][array1[0].length][array1[0][0].length];

  // Add the corresponding elements of the two arrays
  for (int i = 0; i < result.length; i++) {
    for (int j = 0; j < result[0].length; j++) {
      for (int k = 0; k < result[0][0].length; k++) {
        result[i][j][k] = array1[i][j][k] + array2[i][j][k];
      }
    }
  }

  return result;
}
 
}
