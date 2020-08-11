package TestSkill2;

import java.util.ArrayList;
import java.util.Scanner;

public class DisPlayProgram {

    public static void main(String[] args) {
        String account ="";
        String password = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Phần mềm quản lí nhà xưởng ô tô ");
        System.out.println("nhập vào tên đăng nhập: ");
        account = scanner.nextLine();
        System.out.println("nhập vào password: ");
        password =scanner.nextLine();

        ArrayList carHospital = new ArrayList();
        CheckIDandPass checkIDandPass = new CheckIDandPass( account,  password);
       if (checkIDandPass.IsAccount() == true && checkIDandPass.IsPasswords() == true){
           System.out.println("mời nhập lựa chọn ");
           System.out.println("1. Quản lí nhân viên");
           System.out.println("2. Quản lí dụng cụ trong nhà xưởng");
           System.out.println("3. Quản lí xe sửa chữa trong ngày");
               int enterChoice1 = Integer.parseInt(scanner.next());
               Choice choice = new Choice(enterChoice1);
                   choice.choice(enterChoice1);
       }else
           System.out.println("mời đăng nhập lại");

    }
}
