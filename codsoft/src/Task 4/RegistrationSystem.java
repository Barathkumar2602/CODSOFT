import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {
    private List<Course> courses;
    private List<Student> students;

    public RegistrationSystem() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Methods to manage courses
    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    // Methods to manage students
    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    // Method to display available courses
    public void displayAvailableCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            int availableSlots = course.getCapacity() - getRegisteredStudentsCount(course.getCourseCode());
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Title: " + course.getTitle());
            System.out.println("Description: " + course.getDescription());
            System.out.println("Capacity: " + course.getCapacity());
            System.out.println("Available Slots: " + availableSlots);
            System.out.println("Schedule: " + course.getSchedule());
            System.out.println("---------------");
        }
    }

    // Method to register a student for a course
    public void registerStudentForCourse(String studentID, String courseCode) {
        Student student = getStudentById(studentID);
        Course course = getCourseByCode(courseCode);

        if (student != null && course != null && !isCourseFull(course.getCourseCode())) {
            student.registerForCourse(courseCode);
            System.out.println(student.getName() + " successfully registered for " + course.getTitle());
        } else {
            System.out.println("Registration failed. Invalid student, course, or the course is full.");
        }
    }

    // Method to drop a course for a student
    public void dropCourseForStudent(String studentID, String courseCode) {
        Student student = getStudentById(studentID);
        Course course = getCourseByCode(courseCode);

        if (student != null && course != null && student.getRegisteredCourses().contains(courseCode)) {
            student.dropCourse(courseCode);
            System.out.println(student.getName() + " successfully dropped " + course.getTitle());
        } else {
            System.out.println("Course drop failed. Invalid student, course, or the student is not registered for the course.");
        }
    }

    // Helper method to check if a course is full
    private boolean isCourseFull(String courseCode) {
        return getRegisteredStudentsCount(courseCode) >= getCourseByCode(courseCode).getCapacity();
    }

    // Helper method to get the count of registered students for a course
    private int getRegisteredStudentsCount(String courseCode) {
        int count = 0;
        for (Student student : students) {
            if (student.getRegisteredCourses().contains(courseCode)) {
                count++;
            }
        }
        return count;
    }
}
