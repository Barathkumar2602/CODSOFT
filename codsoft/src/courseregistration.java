public class courseregistration {
    public static void main(String[] args) {
        RegistrationSystem registrationSystem = new RegistrationSystem();

        // Adding courses
        Course course1 = new Course("A1", "Java Programming", "Introduction to Java", 30, "MWF 10:00 AM - 11:30 AM");
        Course course2 = new Course("A2", "Database Management", "Fundamentals of Database Systems", 25, "TTH 1:00 PM - 2:30 PM");
        registrationSystem.addCourse(course1);
        registrationSystem.addCourse(course2);

        // Adding students
        Student student1 = new Student("B1", "John");
        Student student2 = new Student("B2", "Jay");
        registrationSystem.addStudent(student1);
        registrationSystem.addStudent(student2);

        // Displaying available courses
        registrationSystem.displayAvailableCourses();

        // Registering students for courses
        registrationSystem.registerStudentForCourse(student1.getStudentID(), course1.getCourseCode());
        registrationSystem.registerStudentForCourse(student2.getStudentID(), course1.getCourseCode());
        registrationSystem.registerStudentForCourse(student2.getStudentID(), course2.getCourseCode());

        // Displaying registered courses for a student
        System.out.println("\nRegistered Courses for " + student1.getName() + ":");
        for (String courseCode : student1.getRegisteredCourses()) {
            System.out.println(registrationSystem.getCourseByCode(courseCode).getTitle());
        }

        System.out.println("\nRegistered Courses for " + student2.getName() + ":");
        for (String courseCode : student2.getRegisteredCourses()) {
            System.out.println(registrationSystem.getCourseByCode(courseCode).getTitle());
        }

        // Dropping a course for a student
        registrationSystem.dropCourseForStudent(student2.getStudentID(), course1.getCourseCode());

        // Displaying updated registered courses for the student
        System.out.println("\nUpdated Registered Courses for " + student2.getName() + ":");
    }
}
