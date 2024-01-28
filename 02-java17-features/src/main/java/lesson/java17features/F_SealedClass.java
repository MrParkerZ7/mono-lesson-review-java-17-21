package lesson.java17features;

sealed interface D_SealedInterface permits D_SealedAbstract {
    String messageSealedInterface();
}

sealed interface D_SealedAbstract extends D_SealedInterface permits D_SealedClass {
    default String messageSealedInterface() {
        return String.format("Sealed: %s - %s", D_SealedAbstract.class.getName(), this.getClass().getName());
    }
}

sealed class D_SealedClass implements D_SealedAbstract permits D_LessonActive {

    public String messageSealedClass() {
        return String.format("Sealed: %s - %s", D_SealedClass.class.getName(), this.getClass().getName());
    }
}


final class D_LessonActive extends D_SealedClass {

    public String message() {
        return String.format("Sealed: %s", this.getClass().getName());
    }
}
