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
public class q2 {
    public static void removeRandomEntries(List<Integer> list) {
    Random random = new Random();

    while (!list.isEmpty()) {
        int index = random.nextInt(list.size());
        list.remove(index);  // إزالة العنصر عند الفهرس العشوائي
    }
}

}
