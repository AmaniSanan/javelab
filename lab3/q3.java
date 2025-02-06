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
public class q3 {
    public static char shiftChar(char c, int shift, String alphabet) {
    int alphabetSize = alphabet.length();
    int pos = alphabet.indexOf(c);
    if (pos == -1) return c;  // إذا كان الحرف غير موجود في الأبجدية
    return alphabet.charAt((pos + shift + alphabetSize) % alphabetSize);
}

}
