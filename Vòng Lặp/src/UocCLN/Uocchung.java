package UocCLN;

import java.util.Scanner;

public class Uocchung {
    public static void main(String[] args) {
        int fstNum = 0;
        int sndNum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhập vào giá trị thứ 1 ( khác 0) : ");
            fstNum = scanner.nextInt();
            System.out.println("nhập vào giá trị thứ 2 ( khác 0) : ");
            sndNum = scanner.nextInt();
        }while (fstNum == 0 || sndNum ==0);


        fstNum = Math.abs(fstNum);
        sndNum = Math.abs(sndNum);

        System.out.println(fstNum);
        System.out.println(sndNum);

        while (fstNum != sndNum){
            if (fstNum > sndNum){
                fstNum -= sndNum;
            }else {
                sndNum -= fstNum;
            }
        }

        System.out.printf("ước chung lớn nhất là: %d",fstNum);
    }
}
