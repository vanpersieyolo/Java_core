package FindNumbleStudent;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class findIndexSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên hs cần tìm kiếm: ");
        String nameS = scanner.nextLine();
        boolean checkItem = false;


        String[] student = {"Văn", "Lâm", "Quân", "Minh", "Tuấn", "Việt"};
        int i = 0;
        for (; i < student.length; i++) {
            if (student[i].equals(nameS)) {
                checkItem = true;
                break;
            }
        }

        if (checkItem){
            System.out.println("Sinh viên có mã số  = " + i);
            checkItem = false;
        }else {
            System.out.println("ko có sv đó");
        }
    }
}
