package changeTempera;

import java.util.Scanner;

public class ChangeTempera {
    public static void main(String[] args) {
        System.out.println("bấm '1' để chọn  c -> f");
        System.out.println("bấm '2' để chọn f -> c");
        Scanner scanner = new Scanner(System.in);
        int enterChoice = scanner.nextInt();

        if (enterChoice == 1){
            System.out.println("nhap vào số độ C: ");
            double doC = scanner.nextDouble();
            double tdo = ftoc(doC);
            System.out.printf("nhiet do F la: %f độ F ",tdo);
        }else  if (enterChoice == 2){
            System.out.println("nhập vào độ F: ");
            double doF = scanner.nextDouble();
            double tdo = ctof(doF);
            System.out.printf("nhiệt độ C là: %f độ C",tdo);
        }


    }

    public static double ftoc(double nhietdo) {
        double doF = (9.0 / 5) * nhietdo + 32;
        return  doF;
    }

    public static double ctof(double nhietdo) {
        double doC = (5.0 / 9) * (nhietdo - 32);
        return doC;
    }
}
