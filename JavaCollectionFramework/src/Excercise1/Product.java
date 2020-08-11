package Excercise1;

public class Product implements Comparable<Product>{
    int price ;
    int id;
    String name;

    public Product(){
    }
    public Product (int id, int pricce, String name){
        this.id = id;
        this.price = pricce;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "price = " + price + ", id = " + id + ", name = " + name ;
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.getPrice(),o.getPrice());
    }
}
