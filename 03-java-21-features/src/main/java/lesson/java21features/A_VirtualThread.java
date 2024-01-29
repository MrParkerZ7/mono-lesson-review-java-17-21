package lesson.java21features;

public class A_VirtualThread {
    public static void main(String[] args) {
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running on a virtual thread 1 : " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Running on a virtual thread 2 : " + Thread.currentThread());
        });

        System.out.println("Running on the main thread 1 : " + Thread.currentThread());
        try {
            Thread.sleep(1000);
            System.out.println("Running on the main thread 2 : " + Thread.currentThread());
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
