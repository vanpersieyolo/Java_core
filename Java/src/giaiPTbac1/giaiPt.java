package giaiPTbac1;

import java.util.Scanner;

public class giaiPt {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("--------------------------");
        System.out.println(" Pt có dạng: ax + b = 0");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        double a = scanner.nextDouble();

        System.out.println("b = ");
        double b = scanner.nextDouble();

        if (a != 0){
            double anwser = -b / a;
            System.out.printf("pt có nghiem: %f!\n",anwser);
        }else{
            if (b == 0){
                System.out.println("X vô số nghiệm");
            }else {
                System.out.println("vô nghiệm");
            }
        }
    }
}
