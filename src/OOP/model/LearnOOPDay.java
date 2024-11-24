package OOP.model;

import java.util.ArrayList;
import java.util.List;

public class LearnOOPDay {
    public static void main(String[] args){
        Product product1 = new Product();
        product1.productName = "Sting";
        product1.productPrice = 0.65;
        product1.productCompany = "Food and Beverage Company";
        System.out.println("productName:" + product1);
        System.out.println("productPrice:" + product1 +"$");
        System.out.println("productCompany:" + product1);

        Product product2 = new Product();
        product2.productName = "CocaCola";
        product2.productPrice = 0.65;
        product2.productCompany = "Food and beverage Company";

        System.out.println("productName:" + product2);
        System.out.println("productPrice" + product2 + "$");
        System.out.println("productCompany" + product2);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        System.out.println(products);
    }
}
