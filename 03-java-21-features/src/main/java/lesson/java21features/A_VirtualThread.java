package lesson.java21features;

import java.util.concurrent.CountDownLatch;

public class A_VirtualThread {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println(String.format("Running on a virtual thread: %s - %s", Thread.currentThread().isAlive(), Thread.currentThread().threadId()));
            latch.countDown();
        });


        System.out.println(String.format("Running on the main thread 0 : %s - %s", Thread.currentThread().isAlive(), Thread.currentThread().threadId()));
        System.out.println(String.format("Running on inspect virtual thread 1 : %s - %s", virtualThread.isAlive(), virtualThread.threadId()));
        latch.await();
        System.out.println(String.format("Running on inspect virtual thread 2 : %s - %s", virtualThread.isAlive(), virtualThread.threadId()));
    }
}
