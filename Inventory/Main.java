import java.util.*;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));
        
        Stream<Product> prods = service.getAllProducts();
        //using the stream print the products
        prods.forEach(product-> System.out.println(product));
        System.out.println("================================================================================");
        System.out.println("A particular product");
        Product p = service.getProduct("Logi Mouse");
        System.out.println(p);

        System.out.println("Finding all the products at the particular place");
        //getting user input from the enduser for the place parameter
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the place: ");
        String place = sc.nextLine();
        List<String>items = service.getProdsfromPlace(place);
        System.out.println(items);
        sc.close();
        
        System.out.println("A particular text");
        List<Product>things = service.getProductWithText("black");  

        for(Product prod:things){
            System.out.println(prod);
        }

        /*out of warranty */
        System.out.println("Out of warranty");

        List<Product>ooWProds = service.getProductsoutofWarrany(); 
        for(Product prod:ooWProds){
            System.out.println(prod);
        }
    }
}
