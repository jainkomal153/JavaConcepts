import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePlayground {
    public static void main(String[] args) {
        Product book = new Product("Learning Java", 874);
        Product chair = new Product("Chair", 699);
        Product mobile = new Product("Mobile Phone", 5000);
        List<Product> products = new ArrayList<>();
        products.add(book);
        products.add(chair);
        products.add(mobile);

        Collections.sort(products);
        System.out.println(products);

    }

    static class Product implements Comparable<Product> {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
        @Override
        public int compareTo(Product p) {
            return p.price - this.price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
