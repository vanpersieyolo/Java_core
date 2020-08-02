package TestSkill;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShowList {
    public static void main(String[] args) {
        Application application = new Application();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Get all");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Enter ID: ");
                    int id =Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Name: ");
                    String name =scanner.nextLine();
                    System.out.println("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.println("Enter Email: ");
                    String email = scanner.nextLine();
//                   public Student( int id, String name, String address, String email){
                    Student student = new Student( id, name, address, email);
                    application.addNewStudent(student);
                    break;
                case 2:
                    System.out.println("Enter ID: ");
                    id = Integer.parseInt(scanner.nextLine());
                    application.removeStudent(id);
                    break;
                case 3:
                    System.out.println("Enter ID: ");
                    id =Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Name: ");
                    name =scanner.nextLine();
                    System.out.println("Enter Address: ");
                     address = scanner.nextLine();
                    System.out.println("Enter Email: ");
                     email = scanner.nextLine();
//                   public Student( int id, String name, String address, String email){
                    student = new Student( id, name, address, email);
                    application.update(student);

                    break;
                case 4:
                    System.out.println("điền tên cần tìm: ");
                    String name1 = scanner.nextLine();
                    System.out.println(name1);
                    System.out.println(application.findStudent(name1));
                    break;
                case 5:
                    application.getAll();
                    break;

            }

        }while (true);
    }
}
