package lesson.java21features;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private Application application;

    @Test
    void contextLoads() {
        // Basic test to ensure that the Spring context loads successfully
        assertNotNull(application);
    }

    @Test
    void mainMethodShouldNotThrowException() {
        // Test to ensure that the main method does not throw any exception
        assertDoesNotThrow(() -> Application.main(new String[]{}));
    }

    // Add more test cases as needed
}
