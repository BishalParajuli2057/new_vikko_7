public class Student implements Printinfo {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getInformation() {
        return "Student Name: " + name + ", ID: " + id;
    }
    public String getstudentId(){
        return id;
    }
    public String getstudentName(){
        return name;
    }
}
