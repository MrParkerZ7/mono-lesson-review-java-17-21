package lesson.java17features;

import java.util.List;


public class E_LocalVariableLambdaExpressions {
    record Product(Double price, Double cost) {
    }

    List<Double> sample(List<Product> products) {
        return products.stream().map(
                (product -> product.price() - product.cost())
        ).toList();
    }
}
