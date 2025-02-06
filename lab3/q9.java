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
public class q9 {
    public void add(GameEntry e) {
    if (n < board.length) {
        board[n] = e;  // أضف في الموقع التالي المتاح
        n++;
    }
}

public void remove(int i) {
    if (i >= 0 && i < n) {
        board[i] = board[n - 1];  // استبدل بآخر عنصر
        board[n - 1] = null;
        n--;
    }
}
}
