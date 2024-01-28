package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class D_SealedClassTests {

    @Test
    void testMessageSealedClass() {
        // Create an instance of the concrete subclass
        D_LessonActive lessonActive = new D_LessonActive();

        // Test method calls using pattern matching
        assertEquals("Sealed: lesson.java17features.D_SealedAbstract - lesson.java17features.D_LessonActive",
                lessonActive.messageSealedInterface());

        assertEquals("Sealed: lesson.java17features.D_SealedClass - lesson.java17features.D_LessonActive",
                lessonActive.messageSealedClass());

        assertEquals("Sealed: lesson.java17features.D_LessonActive", lessonActive.message());
    }
}
