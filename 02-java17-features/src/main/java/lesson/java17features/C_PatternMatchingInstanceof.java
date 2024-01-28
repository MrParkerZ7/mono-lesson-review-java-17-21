package lesson.java17features;

public class C_PatternMatchingInstanceof {

    record Storage(String name, Integer age) {
    }

    String sampleByIf(Object value) {
        if (value instanceof String str) {
            return String.format("Integer %s", str);
        } else if (value instanceof Integer i) {
            return String.format("Integer %d", i);
        } else if (value instanceof Storage CStorage) {
            return String.format("Storage %s %d", CStorage.name(), CStorage.age());
        } else {
            return String.format("Unknown %s", value);
        }
    }
}
