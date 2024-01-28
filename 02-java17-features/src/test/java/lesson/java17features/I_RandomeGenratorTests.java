package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class I_RandomeGenratorTests {

    @Test
    void nextInt_GeneratesIntegersWithinRange() {
        I_RandomeGenrator generator = new I_RandomeGenrator();

        IntStream.range(0, 100).forEach(i -> {
            int randomValue = generator.nextInt();
            assertTrue(randomValue >= 0 && randomValue < 100);
        });
    }

    @Test
    void of_GeneratesBooleanValues() {
        I_RandomeGenrator generator = new I_RandomeGenrator();

        IntStream.range(0, 100).forEach(i -> {
            boolean randomBoolean = generator.of();
            assertTrue(randomBoolean == true || randomBoolean == false);
        });
    }
}
