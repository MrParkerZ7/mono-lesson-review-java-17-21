package lesson.java21features;

public class G_SwitchExpressionsType {

    static String sampleByBool(Object value) {
        return switch (value) {
            case Integer i -> String.format("INTEGER %d", i);
            case Long l -> String.format("INTEGER %d", l);
            default -> String.format("Unknow %s", value);
        };
    }
}

