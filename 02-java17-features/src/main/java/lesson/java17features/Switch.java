package lesson.java17features;

public class Switch {

    static String switchBoolPattern(Integer value) {
        return switch (value) {
            case 1 -> "Case 1";
            case 2 -> "Case 2";
            default -> String.format("Unknown Case %d", value);
        };
    }
}

