import java.util.Scanner;

public class ShowNextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào ngày: ");
        int enterDay = scanner.nextInt();
        System.out.println("nhập vào tháng: ");
        int enterMonth = scanner.nextInt();
        System.out.println("nhập vào năm: ");
        int enterYear = scanner.nextInt();

       NextDayCaculator nextDayCaculator = new NextDayCaculator(enterDay,enterMonth,enterYear);
       nextDayCaculator.nextDay(enterDay,enterMonth,enterYear);
    }
}
