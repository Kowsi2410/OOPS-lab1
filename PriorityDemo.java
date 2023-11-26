/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication83;
public class PriorityDemo {

    public static void main(String[] args) {
        // Create two threads with different priorities
        Thread highPriorityThread = new Thread(new Worker(), "HighPriorityThread");
        Thread lowPriorityThread = new Thread(new Worker(), "LowPriorityThread");

        // Set thread priorities
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // 10
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // 1

        // Start the threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": Count - " + i);

                try {
                    // Introduce a small delay to make the effect more visible
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
