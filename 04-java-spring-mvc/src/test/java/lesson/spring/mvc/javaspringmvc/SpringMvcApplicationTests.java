package lesson.spring.mvc.javaspringmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringMvcApplicationTests {

    @Autowired
    private SpringMvcApplication application;

    @Test
    void contextLoads() {
        assertNotNull(application);
    }

    @Test
    void mainMethodShouldNotThrowException() {
        assertDoesNotThrow(() -> SpringMvcApplication.main(new String[]{}));
    }

}
