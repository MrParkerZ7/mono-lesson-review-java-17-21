package lesson.java21features;

import static java.lang.StringTemplate.RAW;

public class G_StringTemplates {

    public String sample() {
        String name = "Puck";
        String location = "your home";
        String dueDate = "now";
        StringTemplate template = RAW
                ."Dear \{name}, please get out from \{location} degrees \{dueDate}";
        return template.toString();
    }
}
