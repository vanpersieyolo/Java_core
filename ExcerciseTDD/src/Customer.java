import java.util.ArrayList;

public class Customer {
    int id = 1;
    String address = "";
    String email = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Customer(int id, String address, String email){
       this.id = id;
       this.address = address;
       this.email = email;
   }

    public static void main(String[] args) {
        ArrayList<Customer>list = new ArrayList<>();
        Customer c1 = new Customer(1,"hanoi","van@mal");
        Customer c2 = new Customer(2,"cà mau", "Lam@mail");
        Customer c3 = new Customer(3,"Đà Nẵng", "Viet@mail");

        list.add(c1);
        list.add(c2);
        list.add(c3);

        for (Customer customer: list) {
            System.out.println(customer.toString());

        }
    }
}
