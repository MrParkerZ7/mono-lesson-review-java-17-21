package lesson.java21features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class G_StringTemplatesTests {

    @Test
    void sample() {
        G_StringTemplates templateTester = new G_StringTemplates();
        String expectedOutput = "Dear {name}, please get out from {location} degrees {dueDate}";
        String actualOutput = templateTester.sample();
        assertEquals(expectedOutput, actualOutput);
    }

}
