package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class B_SwitchExpressionsTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFormatterPatternSwitchBool() {
        String result1 = B_SwitchExpressions.switchBoolPattern(1);
        assertEquals("Case 1", result1);

        String result2 = B_SwitchExpressions.switchBoolPattern(2);
        assertEquals("Case 2", result2);

        String resultUnknown = B_SwitchExpressions.switchBoolPattern(3);
        assertEquals("Unknown Case 3", resultUnknown);
    }

}
