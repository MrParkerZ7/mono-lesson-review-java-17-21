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
        assertNotNull(application);
    }

    @Test
    void mainMethodShouldNotThrowException() {
        assertDoesNotThrow(() -> Application.main(new String[]{}));
    }

}
