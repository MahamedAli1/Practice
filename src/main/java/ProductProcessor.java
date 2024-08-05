import java.util.List;

public class ProductProcessor {

    public void processProducts(List<Product> products, Conditional conditional, Action action) {
        for (Product product : products) {
            if (conditional.test(product)) {
                action.execute(product);
            }
        }
    }
}
