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
public class q5 {
    public class RoundRobinScheduler {
    public static void schedule(CircularQueue<String> processes, int timeSlice) {
        while (!processes.isEmpty()) {
            String process = processes.dequeue();
            System.out.println("Executing: " + process + " for " + timeSlice + " ms");
            processes.enqueue(process);
        }
    }

    public static void main(String[] args) {
        CircularQueue<String> processes = new LinkedCircularQueue<>();
        processes.enqueue("P1");
        processes.enqueue("P2");
        processes.enqueue("P3");
        processes.enqueue("P4");

        schedule(processes, 100); // كل عملية تأخذ 100 مللي ثانية
    }
}

}
