//o método test() é responsável por avaliar um predicado (condição) em um objeto, retornando um valor booleano que indica se o predicado é verdadeiro ou falso para o objeto fornecido. No exemplo, ele é usado para testar se um produto atende ao filtro definido pela expressão lambda.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação da lista de produtos
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product A", 150));
        productList.add(new Product("Product B", 80));
        productList.add(new Product("Product C", 200));

        // Chamada da função filterAndPrint utilizando uma expressão lambda como filtro
        filterAndPrint(productList, product -> product.getPrice() > 100);
    }

    // Função que recebe uma lista e uma função como argumentos e imprime os elementos que respeitam o filtro
    public static void filterAndPrint(List<Product> list, Predicate<Product> filter) {
        // Itera sobre os elementos da lista
        for (Product product : list) {
            // Verifica se o elemento respeita o filtro
            if (filter.test(product)) {
                // Imprime o elemento
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }
    }
}
