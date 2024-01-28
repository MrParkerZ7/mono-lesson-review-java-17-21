package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class A_RecordsTests {

    private A_Records aRecords = new A_Records();

    @Test
    void newProject_shouldCreateProjectWithCorrectNameAndScore() {
        String name = "Test Project";
        Integer score = 95;

        A_Project AProject = aRecords.newProject(name, score);

        assertEquals(name, AProject.name());
        assertEquals(score, AProject.score());
    }
}
