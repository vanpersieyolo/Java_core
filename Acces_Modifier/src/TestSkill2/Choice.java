package TestSkill2;

import java.util.ArrayList;
import java.util.Scanner;

public class Choice {
    int enterChoice ;

    public Choice (int enterChoice){
        this.enterChoice = enterChoice;
    }

    public  void choice(int enterChoice1){
        ArrayList carHospital = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        switch (this.enterChoice) {
            case 1:
                System.out.println("Thư mực quản lí nhân viên");
                System.out.println("1. Thêm 1 nhân viên mới");
                System.out.println("2. Xóa 1 nhân viên ");
                System.out.println("3. Sửa lí lịch nhân viên");
                System.out.println("4. In ra toàn bộ nhân viên");
                System.out.println("xin mời nhập lựa chọn: ");
                int choice1 = Integer.parseInt(scanner.next());
                switch (choice1) {
                    case 1:
                }
                break;
            case 2:
                do {
                    back:
                    {
                        System.out.println("Thư mục quản lí nhà xưởng");
                        System.out.println("1. Thêm dụng cụ");
                        System.out.println("2. Xóa dụng cụ");
                        System.out.println("3. In ra toàn bộ dụng cụ");
                    }
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2) {
                        case 1:
                            System.out.println("nhập tên dụng cụ: ");
                            String nameTools = scanner.nextLine();
                            FactoryTools factoryTools1 = new FactoryTools(nameTools);
                            carHospital.add(factoryTools1);
                            break;
                        case 2:
                            System.out.println("nhập vào tên dụng cụ cần xóa: ");
                            String nameRemove = scanner.nextLine();
                            for (Object a : carHospital) {
                                if (a.equals(nameRemove)) {
                                }
                                carHospital.remove(a);
                                break;
                            }
                        case 3:
                            System.out.println(carHospital);
                        default:
                            break ;
                        }
                    }
                    while (true) ;
                    case 3:
                        System.out.println("Thư mục quản lí các xe sửa chữa trong ngày");
                        System.out.println("1. Thêm xe mới vào");
                        System.out.println("2. Xóa xe vừa ra");
                        System.out.println("3. Các xe còn trong xưởng");
                        break;

        }
    }
}
