package PrintGreeting;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String yourName;
        System.out.println("Enter your name: ");

        Scanner scanner = new Scanner (System.in);
        yourName = scanner.nextLine();

        System.out.printf("Hello %s",yourName);;
    }
}
