package com.berruhanedar.tutorials._6_week;

public class _02_MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
    }
}

class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new _02_MyRunnable());
        Thread thread2 = new Thread(new _02_MyRunnable());
        Thread thread3 = new Thread(new _02_MyRunnable());

        thread1.start();
        thread2.start();
        thread2.join(); // thread3 will start only after thread2 finishes
        thread3.start();
    }
}