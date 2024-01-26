package lesson.java21features;

public class Features {

    static String formatterPatternSwitchBool(Object value) {
        return switch (value) {
            case Integer i -> String.format("INTEGER %d", i);
            case Long l -> String.format("INTEGER %d", l);
            default -> String.format("Unknow %s", value);
        };
    }
}

