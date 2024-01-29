package lesson.java21features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class A_VirtualThreadTests {

    @Test
    void testSampleMethod() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        Thread virtualThread = Thread.ofVirtual().start(() -> {
            assertNotNull(Thread.currentThread().threadId());
            latch.countDown();
        });

        assertTrue(virtualThread.isAlive());
        latch.await(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
        assertFalse(virtualThread.isAlive());
    }
}
