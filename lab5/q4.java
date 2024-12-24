/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author KH
 */
public class q4 {
    public static boolean areCircularListsEqual(CircularlyLinkedList<?> L, CircularlyLinkedList<?> M) {
    if (L.size() != M.size()) {
        return false;
    }
    for (int i = 0; i < L.size(); i++) {
        if (L.equals(M)) {
            return true;
        }
        M.rotate();
    }
    return false;
}

}
