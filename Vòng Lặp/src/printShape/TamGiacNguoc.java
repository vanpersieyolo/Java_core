package printShape;

public class TamGiacNguoc {
    public static void main(String[] args) {
        for (int i = 5; i >=1  ; i--) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
