package Excercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DisplayProgram {
    public static void main(String[] args) {
        ProductManage productManage = new ProductManage();
        Scanner scanner =  new Scanner(System.in);
        do {
            again:
            {
                System.out.println("Chương trình quản lí sản phẩm");
                System.out.println("------------------------------");
                System.out.println("1. Thêm sản phẩm mới");
                System.out.println("2. Sửa thông tin sản phẩm theo ID");
                System.out.println("3. Xóa sản phẩm theo ID");
                System.out.println("4. Hiển thị sản phẩm theo tên");
                System.out.println("5. Tìm kiếm sản phẩm theo tên");
                System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
                System.out.println("Nhập vào lựa chọn: ");
            }
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập giá bán: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên sp: ");
                    String name = scanner.nextLine();
                    Product product = new Product(id,price,name);
                    productManage.addAProduct(product);
                    productManage.sortProduct();
                    break;
                case 2:
                    System.out.println("nhập vào ID: ");
                    int idd = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập vào giá bán: ");
                    int pricee = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên sp: ");
                    String namee = scanner.nextLine();
                    Product product1 = new Product(idd,pricee, namee);
                    productManage.editInforProduct(product1);
                    break;
                case 3:
                    System.out.println("nhập vào id  cần xóa: ");
                    int idRemove = Integer.parseInt(scanner.nextLine());
                    productManage.removeAProduct(idRemove);
                    break;
                case 4:
                    productManage.DisplayAll();
                    break;
                case 5:
                    System.out.println("nhập vào tên sp: ");
                    String namePr = scanner.nextLine();
                    productManage.FindProductByName( namePr);
                case 6:


            }

        }while (true);
    }

}
