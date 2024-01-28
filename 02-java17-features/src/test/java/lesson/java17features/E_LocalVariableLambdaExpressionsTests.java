package lesson.java17features;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class E_LocalVariableLambdaExpressionsTests {

    @Test
    void sample_CalculatesProfitsCorrectly() {
        E_LocalVariableLambdaExpressions calculator = new E_LocalVariableLambdaExpressions();

        List<E_LocalVariableLambdaExpressions.Product> products = List.of(
                new E_LocalVariableLambdaExpressions.Product(10.0, 5.0),
                new E_LocalVariableLambdaExpressions.Product(15.0, 8.0),
                new E_LocalVariableLambdaExpressions.Product(20.0, 12.0)
        );

        List<Double> profits = calculator.sample(products);

        assertEquals(List.of(5.0, 7.0, 8.0), profits);
    }

    @Test
    void sample_HandlesEmptyList() {
        E_LocalVariableLambdaExpressions calculator = new E_LocalVariableLambdaExpressions();

        List<E_LocalVariableLambdaExpressions.Product> emptyProducts = List.of();

        List<Double> profits = calculator.sample(emptyProducts);

        assertEquals(List.of(), profits);
    }
}
