package Excercise1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class ProductManage {
    ArrayList<Product> arrayLists = new ArrayList<>();

    public void addAProduct(Product product){
        arrayLists.add(product);
    }

    public void editInforProduct(Product product){
        for (Product a : arrayLists) {
                    product.setName(a.getName());
                    product.setPrice(a.getPrice());
        }
    }
    public boolean removeAProduct(int id){
        for (Product b:  arrayLists) {
            if (id == b.getId()){
               return arrayLists.remove(b);
            }
        }
        return false;
    }
    public void DisplayAll(){
        for (Product a : arrayLists)  {
            System.out.println(a.toString());
        }
    }
    public void FindProductByName(String name){
        for ( Product pr: arrayLists) {
            if (pr.getName().equals(name)){
                System.out.println(pr.toString());
            }
        }
    }
    public void sortProduct(){
        Collections.sort(arrayLists);
    }
}
