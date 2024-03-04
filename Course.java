public class Course {
    private String name;
    private int maxNumberOfStudents;
    private String id;

    public Course(String name, String id, int maxNumberOfStudents){
        this.name=name;
        this.id=id;
        this.maxNumberOfStudents=maxNumberOfStudents;
    }
    public String getcourseId(){
        return id;
    }
    public String getcourseName(){
        return name;
    }
}
