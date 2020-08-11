public class QuanLiXe {
    String brand;
    String bks;
    int cost;

    public QuanLiXe(String brand, String bks, int cost) {
        this.brand = brand;
        this.bks = bks;
        this.cost = cost;
    }

    public QuanLiXe() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBks() {
        return bks;
    }

    public void setBks(String bks) {
        this.bks = bks;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
