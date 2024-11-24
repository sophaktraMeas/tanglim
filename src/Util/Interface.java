package Util;
interface ProductService{
    void getProductById(Integer id);
    void listAllProducts();
}
class ProductServiceImpl implements ProductService{
    @Override
    public void getProductById(Integer id) {
        System.out.println("This is product ID:" + id);
    }

    @Override
    public void listAllProducts() {
        System.out.println("These are all products");
    }
}
public class Interface {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        productService.getProductById(123);
        productService.listAllProducts();
    }

}

