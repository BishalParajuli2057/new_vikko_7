import java.util.Scanner;

public class App {

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
