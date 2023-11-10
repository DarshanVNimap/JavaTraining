package org.DarshanValaJavaTraining.MultiThreading;

public class TheadingWithRunnable {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("--------------------Using Rannable interface--------------");
            Thread thead = new Thread(new MyProccess());
            thead.start();
            thead.join();
        System.out.println("Play next video...");

        System.out.println("---------------Using Thread class----------------");
        MyThread t = new MyThread();
        t.start();

    }
}
