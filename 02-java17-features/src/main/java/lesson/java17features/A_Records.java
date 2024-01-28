package lesson.java17features;

public class A_Records {

    record Project(String name, Integer score) {
    }

    Project newProject(String name, Integer score) {
        return new Project(name, score);
    }
}
