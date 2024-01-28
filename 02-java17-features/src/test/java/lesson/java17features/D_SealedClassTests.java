package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class D_SealedClassTests {

    @Test
    void testMessageSealedClass() {
        SealedClass sealedClass = new LessonActive();

        assertEquals("Sealed: lesson.java17features.SealedAbstract - lesson.java17features.LessonActive",
                sealedClass.messageSealedInterface());

        assertEquals("Sealed: lesson.java17features.SealedClass - lesson.java17features.LessonActive",
                sealedClass.messageSealedClass());

        assertEquals("Sealed: lesson.java17features.LessonActive", ((LessonActive) sealedClass).message());
    }
}
