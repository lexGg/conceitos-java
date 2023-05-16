import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação da lista de produtos
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Produto C"));
        productList.add(new Product("Produto B"));
        productList.add(new Product("Produto A"));

        // Utilização do Comparator com expressão lambda
        productList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        // Impressão da lista ordenada
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }
}
