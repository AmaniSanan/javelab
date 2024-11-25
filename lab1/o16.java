/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;


public class o16 {
    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String testString = "Let’s try, Mike!";
        String result = removePunctuation(testString);
        System.out.println(result);  
    }
}
