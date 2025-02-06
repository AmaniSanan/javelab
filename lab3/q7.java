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
public class q7 {
    public static int findRepeatedElement(int[] A) {
        Set<Integer> seen = new HashSet<>();
        for (int num : A) {
            if (seen.contains(num)) {
                return num; // الرقم المكرر
            }
            seen.add(num); // أضف الرقم إلى المجموعة
        }
        return -1; // في حالة عدم وجود رقم مكرر (غير ممكن حسب السؤال)
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 2, 2};
        System.out.println("Repeated Element: " + findRepeatedElement(A)); // الناتج: 2
    }
}
