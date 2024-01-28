package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class F_SealedClassTests {

    @Test
    void testMessageSealedClass() {
        D_LessonActive lessonActive = new D_LessonActive();

        assertEquals("Sealed: lesson.java17features.D_SealedAbstract - lesson.java17features.D_LessonActive",
                lessonActive.messageSealedInterface());

        assertEquals("Sealed: lesson.java17features.D_SealedClass - lesson.java17features.D_LessonActive",
                lessonActive.messageSealedClass());

        assertEquals("Sealed: lesson.java17features.D_LessonActive", lessonActive.message());
    }
}
