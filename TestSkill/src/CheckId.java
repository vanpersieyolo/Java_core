import java.util.Scanner;

public class CheckId {
    String id = "";
    int passwords ;

    public CheckId() {
    }

    public boolean displayCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào ID: ");
        this.id = scanner.nextLine();
        System.out.println("Nhập vào passwords: ");
        this.passwords = Integer.parseInt(scanner.next());

        if (this.id.equals("quanli")   && this.passwords == 12345){
            return true;
        }
        return false;
    }

}
