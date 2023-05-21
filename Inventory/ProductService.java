import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public Stream<Product> getAllProducts() 
    {
        return products.stream();
    }

    public Product getProduct(String name)
    {
        return products.stream()
                    .filter(p -> p.getName().equals(name))
                    .findFirst()
                    .orElse(null);
    }

    public List<Product> getProductWithText(String text){
        String str = text.toLowerCase();
        return products.stream()
                    .filter(p -> p.getName().toLowerCase().contains(str) ||
                                    p.getType().toLowerCase().contains(str) ||
                                    p.getPlace().toLowerCase().contains(str))
                    .collect(Collectors.toList());
    }

    /*Search By place */
    public List<String> getProdsfromPlace(String place){
        return products.stream()
                    .filter(p -> p.getPlace().equals(place))
                    .map(Product::getName)
                    .collect(Collectors.toList());
    }

    /*out of warranty */
    public List<Product> getProductsoutofWarrany()
    {
        return products.stream()
                    .filter(p -> p.getWarranty() < 2024)
                    .collect(Collectors.toList());
    }
}
