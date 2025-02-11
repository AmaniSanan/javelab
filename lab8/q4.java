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
public class q4 {
    public class Josephus {
    public static <E> E solveJosephus(CircularQueue<E> queue, int k) {
        if (queue.isEmpty()) return null;
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++)
                queue.rotate(); // تدوير الطابور
            System.out.println(queue.dequeue() + " is out");
        }
        return queue.dequeue(); // الفائز
    }

    public static void main(String[] args) {
        CircularQueue<String> queue = new LinkedCircularQueue<>();
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        for (String name : names) queue.enqueue(name);

        System.out.println("Winner: " + solveJosephus(queue, 3));
    }
}

}
