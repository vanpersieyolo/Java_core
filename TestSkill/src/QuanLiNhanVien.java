public class QuanLiNhanVien {
    String name;
    String address;
    int id;

    public QuanLiNhanVien(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public QuanLiNhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QuanLiNhanVien{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
