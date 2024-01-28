package lesson.java17features;

record A_Project(String name, Integer score) {
}

public class A_Records {

    A_Project newProject(String name, Integer score) {
        return new A_Project(name, score);
    }
}
