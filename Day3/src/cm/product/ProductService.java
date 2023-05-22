package cm.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> products = new ArrayList<>();
    ProductDB db=new ProductDB();
    public void addProduct(Product p) {
        products.add(p);
    	//db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.getAll();
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name))
                return p;
        }

        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();

        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(str)
                        || p.getType().toLowerCase().contains(str)
                        || p.getPlace().toLowerCase().contains(str))
                .collect(Collectors.toList());
    }

    public List<Product> getProductWithWarranty(int warranty) {
        return products.stream()
                .filter(p -> p.getWarranty() == warranty)
                .collect(Collectors.toList());
    }
}