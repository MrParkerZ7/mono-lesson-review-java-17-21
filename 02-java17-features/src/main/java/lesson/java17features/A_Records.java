package lesson.java17features;

record Project(String name, Integer score) {
}

public class A_Records {

    Project newProject(String name, Integer score) {
        return new Project(name, score);
    }
}
