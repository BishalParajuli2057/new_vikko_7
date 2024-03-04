public class Enrollment {
    private Student student;
    private Course course;
    private int grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.grade = -1; 
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
