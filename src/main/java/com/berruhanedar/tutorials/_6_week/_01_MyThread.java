package com.berruhanedar.tutorials._6_week;

// Extends Thread
public class _01_MyThread extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
    }
}

// Extends Thread (Main)
class ThreadExample {
    public static void main(String[] args) {
        _01_MyThread thread1 = new _01_MyThread();
        _01_MyThread thread2 = new _01_MyThread();

        thread1.start(); // Starts a new thread
        thread2.start();
    }
}