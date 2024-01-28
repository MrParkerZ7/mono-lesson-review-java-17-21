package lesson.java17features;

sealed interface SealedInterface permits SealedAbstract {
    String messageSealedInterface();
}

sealed interface SealedAbstract extends SealedInterface permits SealedClass {
    default String messageSealedInterface() {
        return String.format("Sealed: %s - %s", SealedAbstract.class.getName(), this.getClass().getName());
    }
}

sealed class SealedClass implements SealedAbstract permits LessonActive {

    public String messageSealedClass() {
        return String.format("Sealed: %s - %s", SealedClass.class.getName(), this.getClass().getName());
    }
}


final class LessonActive extends SealedClass {

    public String message() {
        return String.format("Sealed: %s", this.getClass().getName());
    }
}
