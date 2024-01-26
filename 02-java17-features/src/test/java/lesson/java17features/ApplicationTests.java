package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
