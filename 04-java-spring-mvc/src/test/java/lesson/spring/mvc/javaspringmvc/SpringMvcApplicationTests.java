package lesson.spring.mvc.javaspringmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void test() {
        {
            List<Integer> case1 = List.of(25, 2, 3, 57, 38, 41);

            List<Integer> result1 = mostAppearedDigits(case1);

            assertEquals(result1, List.of(2, 3, 5));
        }

        {
            List<Integer> case1 = List.of(250, 20, 30, 570, 38, 41);

            List<Integer> result1 = mostAppearedDigits(case1);

            assertEquals(result1, List.of(0));
        }
    }

    List<Integer> mostAppearedDigits(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> numberAppear = new HashMap<>();

        nums.forEach(i -> {
            List<String> charList = List.of(i.toString().split(""));

            charList.forEach(ch -> {
                if (numberAppear.containsKey(ch)) {
                    numberAppear.put(ch, numberAppear.get(ch) + 1);
                } else {
                    numberAppear.put(ch, 1);
                }
            });
        });

        List<Integer> orderTop = numberAppear.values().stream().sorted().toList();
        Integer top = orderTop.get(orderTop.size() - 1);

        numberAppear.forEach((key, value) -> {
            if (value == top)
                result.add(Integer.valueOf(key));
        });

        return result;
    }
}
