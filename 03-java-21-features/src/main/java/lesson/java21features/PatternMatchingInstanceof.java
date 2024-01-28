package lesson.java21features;

record Storage(String name, Integer age) {
}

public class PatternMatchingInstanceof {

    String sampleBySwitchExpression(Object value) {
        return switch (value) {
            case String str -> String.format("String %s", str);
            case Integer i -> String.format("Integer %d", i);
            case Storage storage -> String.format("Storage %s %d", storage.name(), storage.age());
            default -> String.format("Unknown %s", value);
        };
    }
}
