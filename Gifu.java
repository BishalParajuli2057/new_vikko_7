import java.util.ArrayList;

public class Gifu {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Enrollment> enrollments;

    public Gifu() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Course getCourse(int index) {
        return courses.get(index);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public ArrayList<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void enrollStudentToCourse(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
    }

    public ArrayList<Enrollment> getEnrollments() {
        return new ArrayList<>(enrollments);
    }
}

