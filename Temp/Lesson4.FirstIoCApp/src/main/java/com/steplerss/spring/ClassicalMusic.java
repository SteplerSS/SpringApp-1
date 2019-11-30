package ru.alishev.springcourse;

/**
 * @author Neil Alishev
 */
@Component("musicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
