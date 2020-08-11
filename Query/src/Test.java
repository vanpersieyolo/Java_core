import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class Test{
    int id ;
    String name;
    String address;
    public Test(){
    }
    public Test(int id, String name, String adđress){
        this.id = id;
        this.name = name;
        this.address = adđress;
    }

      protected int getId() {
        return id;

    }

    //    public int find(){
//        for (int i = 0; i < student.length ; i++) {
//
//        }
//    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
       List studen = new ArrayList<>(2);
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

           if (studen.get(i) instanceof Test){
               System.out.println(studen.get(i));
           }
        }

    }
}
