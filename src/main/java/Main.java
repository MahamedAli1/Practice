import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Apple", 120, 0),
                new Product("Banana", 80, 10),
                new Product("Orange", 150, 5),
                new Product("Blueberry", 200, 1)
        );

        ProductProcessor processor = new ProductProcessor();

        // Print all products that have stock value of 0
        System.out.println("Products with stock value 0:");
        processor.processProducts(products,
                p -> p.getStock() == 0,
                p -> System.out.println(p));

        // Print out the productName of all the products that start with B
        System.out.println("\nProducts with name starting with B:");
        processor.processProducts(products,
                p -> p.getProductName().startsWith("B"),
                p -> System.out.println(p.getProductName()));

        // Print out all products that have price above 100 and lower than 150
        System.out.println("\nProducts with price above 100 and lower than 150:");
        processor.processProducts(products,
                p -> p.getPrice() > 100 && p.getPrice() < 150,
                p -> System.out.println(p));

        // Increase the price of all products that have a stock value of less than 10 and above 0 by 50%
        System.out.println("\nIncreasing price of products with stock between 0 and 10 by 50%:");
        processor.processProducts(products,
                p -> p.getStock() > 0 && p.getStock() < 10,
                p -> {
                    p.setPrice(p.getPrice() * 1.5);
                    System.out.println(p);
                });
    }
}
