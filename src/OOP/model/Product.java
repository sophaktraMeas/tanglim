package OOP.model;

public class Product {
    public String productName;
    public double productPrice;
    public String productCompany;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCompany='" + productCompany + '\'' +
                '}';
    }

    public void getUserInfo(){
        System.out.println("=".repeat(20));
        System.out.println("productName:" + productName);
        System.out.println("productPrice:" + productPrice);
        System.out.println("productBrand:" + productCompany);
    }
}
