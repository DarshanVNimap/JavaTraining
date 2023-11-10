package org.DarshanValaJavaTraining.MultiThreading;

public class MyProccess implements Runnable{
    @Override
    public void run() {
        System.out.println("Video Stream..... "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Streaming complete... ");
    }
}
