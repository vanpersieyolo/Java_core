package BMI;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so can nang (kg): ");
        weight = scanner.nextDouble();
        System.out.println("nhap vao chieu cao (cm): ");
        height = scanner.nextDouble();

       bmi = weight / (Math.pow(height,2));
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("underweight !");
        }else {
            if (18.5 <= bmi && bmi < 25.0){
                System.out.println("Normal !");
            }else {
                if (25.0 <= bmi && bmi < 30.0){
                    System.out.println("OverWeight");
                }else {
                    if (bmi > 30.0){
                        System.out.println("obese");
                    }
                }
            }
        }
    }
}
