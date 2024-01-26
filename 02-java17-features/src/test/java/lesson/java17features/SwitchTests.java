package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SwitchTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFormatterPatternSwitchBool() {
        String result1 = Switch.switchBoolPattern(1);
        assertEquals("Case 1", result1);

        String result2 = Switch.switchBoolPattern(2);
        assertEquals("Case 2", result2);

        String resultUnknown = Switch.switchBoolPattern(3);
        assertEquals("Unknown Case 3", resultUnknown);
    }

}
