package Menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        int enterChoice  ;

        Scanner scanner = new Scanner(System.in);

            System.out.println("=====Menu======");
            System.out.println("1. ghẹ 300k");
            System.out.println("2. ghẹ 500k");
            System.out.println("3. ghẹ 1 củ");
            System.out.println("0. Exit");
            System.out.println("mời bạn chọn món ăn");



            while (true){
                enterChoice = scanner.nextInt();
                switch (enterChoice){
                    case 0:
                        System.out.println("bye");
                        break;
                    case 1:
                        System.out.println("ăn ghẹ 3 lốp");
                        break;
                    case 2:
                        System.out.println("ăn ghẹ 5 lốp");
                        break;
                    case 3:
                        System.out.println("ăn ghẹ 1 củ kìa");
                        break;

                }
            }

    }
}
