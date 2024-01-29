package lesson.java21features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class F_SwitchExpressionsTypeTests {

    @Test
    void testSampleByBool_withInteger() {
        int intValue = 10;
        String result = F_SwitchExpressionsType.sampleByBool(intValue);
        assertEquals("INTEGER 10", result);
    }

    @Test
    void testSampleByBool_withLong() {
        long longValue = 20L;
        String result = F_SwitchExpressionsType.sampleByBool(longValue);
        assertEquals("INTEGER 20", result);
    }

    @Test
    void testSampleByBool_withOtherType() {
        String stringValue = "hello";
        String result = F_SwitchExpressionsType.sampleByBool(stringValue);
        assertEquals("Unknow hello", result);
    }

    @Test
    void testSampleByBool_withNull() {
        assertThrows(NullPointerException.class, () -> {
            F_SwitchExpressionsType.sampleByBool(null);
        });
    }
}
