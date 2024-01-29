package lesson.java21features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class M_PatternMatchingInstanceofTests {

    M_PatternMatchingInstanceof instance = new M_PatternMatchingInstanceof();

    @Test
    void testStringPatternMatching() {
        String stringValue = "Hello";
        String result = instance.sampleBySwitchExpression(stringValue);
        assertEquals("String Hello", result);
    }

    @Test
    void testIntegerPatternMatching() {
        Integer integerValue = 42;
        String result = instance.sampleBySwitchExpression(integerValue);
        assertEquals("Integer 42", result);
    }

    @Test
    void testStoragePatternMatching() {
        M_PatternMatchingInstanceof.Storage storageValue = new M_PatternMatchingInstanceof.Storage("John", 30);
        String result = instance.sampleBySwitchExpression(storageValue);
        assertEquals("Storage John 30", result);
    }

    @Test
    void testUnknownTypePatternMatching() {
        Object unknownValue = new Object();
        String result = instance.sampleBySwitchExpression(unknownValue);
        assertTrue(result.startsWith("Unknown java.lang.Object@"));
    }
}
