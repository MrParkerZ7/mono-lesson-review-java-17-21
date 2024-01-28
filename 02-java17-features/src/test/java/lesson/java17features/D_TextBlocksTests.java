package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class D_TextBlocksTests {

    @Test
    void sample_ReturnsExpectedFormattedString() {
        D_TextBlocks textBlocks = new D_TextBlocks();
        String result = textBlocks.sample();

        assertEquals("""
                Dear Mr.Puck
                    Please check out
                    before we get you out
                """, result);
    }
}
