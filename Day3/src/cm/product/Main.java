package cm.product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String pName, pType, place;
        int warranty;
        try  {
            ProductService service = new ProductService();
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1.Add Product");
                System.out.println("2.Get All Product");
                System.out.println("3.Search Product by Name");
                System.out.println("4.Search Product by Place");
                System.out.println("5.Search Product by Warranty");
                System.out.println("6.Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Product Name: ");
                        sc.nextLine();
                        pName = sc.nextLine();
                        System.out.print("Enter Product Type: ");
                        pType = sc.nextLine();
                        System.out.print("Enter Place: ");
                        place = sc.nextLine();
                        System.out.print("Enter Product Warranty: ");
                        warranty = sc.nextInt();
                        service.addProduct(new Product(pName, pType, place, warranty));
                        System.out.println("Product Stored Successfully...");
                        break;
                    case 2:
                        List<Product> products = service.getAllProducts();
                        System.out.println("======================Product Details==========================\n");
                        for (Product p : products) {
                            System.out.println(p);
                        }
                        break;
                    case 3:
                        System.out.print("Enter Product Name: ");
                        sc.nextLine();
                        pName = sc.nextLine();
                        Product p = service.getProduct(pName);
                        System.out.println("======================Product Details==========================\n");
                        System.out.println(p);
                        break;
                    case 4:
                        System.out.print("Enter Place: ");
                        sc.nextLine();
                        place = sc.nextLine();
                        List<Product> prods = service.getProductWithText(place);
                        System.out.println("======================Product Details==========================\n");
                        for (Product product : prods) {
                            System.out.println(product);
                        }
                        break;
                    case 5:
                        System.out.print("Enter Product Warranty: ");
                        warranty = sc.nextInt();
                        List<Product> prod = service.getProductWithWarranty(warranty);
                        System.out.println("======================Product Details==========================\n");
                        for (Product product : prod) {
                            System.out.println(product);
                        }
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice...");
                }
            }
        } catch (Exception e) {
            System.out.println("Exception Occured " + e);
        }
    }
}