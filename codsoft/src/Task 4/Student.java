import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private List<String> registeredCourses;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public List<String> getRegisteredCourses() {
        return registeredCourses;
    }

    // Method to register for a course
    public void registerForCourse(String courseCode) {
        registeredCourses.add(courseCode);
    }

    // Method to drop a course
    public void dropCourse(String courseCode) {
        registeredCourses.remove(courseCode);
    }
}
