/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author KH
 */
public class q2 {
    public ArrayQueue<E> clone() throws CloneNotSupportedException {
    ArrayQueue<E> cloned = new ArrayQueue<>(data.length);
    cloned.f = this.f;
    cloned.sz = this.sz;
    cloned.data = this.data.clone(); // استنساخ البيانات
    return cloned;
}

}
