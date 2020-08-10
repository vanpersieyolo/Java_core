import java.util.Scanner;

public class ThuMucQuanLi {
    int choice;
    public void display(){
        System.out.println("Thư mục quản lí : ");
        System.out.println("1. Quản lí nhân viên");
        System.out.println("2. Quản lí dụng cụ trong xưởng");
        System.out.println("3. Quản lí xe vào sửa chữa trong xưởng");
    }
    public void choice(){
        Scanner scanner = new Scanner(System.in);
        choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 0:
            }
    }

}

