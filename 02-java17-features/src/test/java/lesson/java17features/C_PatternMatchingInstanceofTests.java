package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class C_PatternMatchingInstanceofTests {

    private C_PatternMatchingInstanceof patternMatchingInstanceof = new C_PatternMatchingInstanceof();

    @Test
    void sampleByIf_StringInput_ReturnsExpectedString() {
        String value = "Hello";
        String result = patternMatchingInstanceof.sampleByIf(value);
        assertEquals("Integer Hello", result);
    }

    @Test
    void sampleByIf_IntegerInput_ReturnsExpectedString() {
        Integer value = 42;
        String result = patternMatchingInstanceof.sampleByIf(value);
        assertEquals("Integer 42", result);
    }

    @Test
    void sampleByIf_StorageInput_ReturnsExpectedString() {
        C_Storage storage = new C_Storage("Alice", 30);
        String result = patternMatchingInstanceof.sampleByIf(storage);
        assertEquals("Storage Alice 30", result);
    }

    @Test
    void sampleByIf_UnknownInput_ReturnsUnknownString() {
        Object value = new Object();
        String result = patternMatchingInstanceof.sampleByIf(value);
        assertTrue(result.startsWith("Unknown java.lang.Object@"), "Result should start with 'Unknown java.lang.Object@'");
    }

    @Test
    void sampleByIf_NullInput_DoesNotThrowException() {
        assertDoesNotThrow(() -> patternMatchingInstanceof.sampleByIf(null));
    }
}
