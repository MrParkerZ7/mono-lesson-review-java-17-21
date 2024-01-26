package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SealedClassTests {

    @Test
    void testMessageSealedClass() {
        SealedClass sealedClass = new LessonActive();

        // Test the messageSealedClass() method from SealedAbstract
        assertEquals("Sealed: lesson.java17features.SealedAbstract - lesson.java17features.LessonActive",
                sealedClass.messageSealedInterface());

        // Test the messageSealedClass() method from SealedClass
        assertEquals("Sealed: lesson.java17features.SealedClass - lesson.java17features.LessonActive",
                sealedClass.messageSealedClass());

        // Test the message() method from LessonActive
        assertEquals("Sealed: lesson.java17features.LessonActive", ((LessonActive) sealedClass).message());
    }

    // Add more test cases as needed
}
