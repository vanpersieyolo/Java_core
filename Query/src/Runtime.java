import java.util.ArrayList;
import java.util.List;

public class Runtime extends Test{
    public static void main(String[] args) {
        List<Test> studen = new ArrayList<>(2);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap vào id: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập vào tên: ");
//        String name = scanner.nextLine();
//        System.out.println("nhập vào địa chỉ: ");
//        String mail = scanner.nextLine();

        Test studen2 = new Test(1,"van","a");
        Test studen3 = new Test(1,"van","b");
        Test studen4 = new Test(2,"van","van");
        Test studen5 = new Test(2,"van","van");

        studen.add(studen2);
        studen.add(studen3);
        studen.add(studen4);
        studen.add(studen5);
        studen.add(new Test());
        System.out.println(studen.size());

        for (int i = 0; i < studen.size(); i++) {
            if (studen.get(i).getId() == 1) {
                System.out.println(studen.get(i));
            }
        }
    }
}


