import java.util.Scanner;
import  java.util.ArrayList;
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tervetuloa Gifu-järjestelmään\nMille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String university = scanner.nextLine();
        Gifu gifu = new Gifu(); 
        boolean quit = false;

        while (!quit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Anna kurssin nimi:");
                    String courseName = scanner.nextLine();
                    System.out.println("Anna kurssin ID:");
                    String courseId = scanner.nextLine();
                    System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                    int maxNumber = scanner.nextInt();
                    scanner.nextLine(); 

                    Course course = new Course(courseName, courseId, maxNumber);
                    gifu.addCourse(course);
                    break;
                case 2:
                    System.out.println("Anna opiskelijan nimi:");
                    String studentName = scanner.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String studentId = scanner.nextLine();

                    Student student = new Student(studentName, studentId);
                    gifu.addStudent(student);
                    break;

                case 3:
                    System.out.println(gifu.listCourses());
                    break;
                
                case 4:
                    System.out.println(gifu.listStudents());
                    break;
                case 5:
                    System.out.println(gifu.listCourses());
                    System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                    int kurssichocie = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(gifu.listStudents());
                    System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                    int studentchoice=scanner.nextInt();
                    scanner.nextLine();

                    break;

                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Virheellinen valinta. Yritä uudelleen.");
                    break;
            }
        }
        scanner.close();
        System.out.println("Kiitos ohjelman käytöstä.");
    }
}
