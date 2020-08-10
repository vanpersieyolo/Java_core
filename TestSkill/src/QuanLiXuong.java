
public class QuanLiXuong {
    public static void main(String[] args) {

        ThuMucQuanLi quanli = new ThuMucQuanLi();
        CheckId checkId = new CheckId();

        if (checkId.displayCheck()==true){
            quanli.display();
        }
    }
}
