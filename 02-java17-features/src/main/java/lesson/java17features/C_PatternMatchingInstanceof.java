package lesson.java17features;

record C_Storage(String name, Integer age) {
}

public class C_PatternMatchingInstanceof {

    String sampleByIf(Object value) {
        if (value instanceof String str) {
            return String.format("Integer %s", str);
        } else if (value instanceof Integer i) {
            return String.format("Integer %d", i);
        } else if (value instanceof C_Storage CStorage) {
            return String.format("Storage %s %d", CStorage.name(), CStorage.age());
        } else {
            return String.format("Unknown %s", value);
        }
    }
}
