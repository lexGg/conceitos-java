//Em resumo, o Stream é uma sequência de elementos que permite realizar 
//operações em massa de forma encadeada. O método map() é uma dessas operações, que mapeia cada elemento do Stream para um novo valor, utilizando uma expressão lambda ou uma função como argumento. No exemplo, o Stream é usado para elevar cada número ao quadrado, e o map() realiza essa transformação para cada elemento.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação de uma lista de números
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Utilização de Stream e map para transformar os números
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();

        // Impressão dos números transformados
        for (Integer number : squaredNumbers) {
            System.out.println(number);
        }
    }
}

//Neste exemplo, a lista numbers é uma lista de números inteiros. Vamos analisar o uso do Stream e map nesta situação:

//numbers.stream() - O método stream() é chamado na lista numbers, criando um Stream a partir dessa lista. O Stream permite realizar operações em sequência nos elementos da lista.

//.map(n -> n * n) - O método map() é utilizado para transformar cada elemento do Stream. Nesse caso, estamos usando uma expressão lambda n -> n * n para elevar cada número ao quadrado.

//O map() aplica a transformação em cada elemento do Stream e retorna um novo Stream` contendo os resultados transformados.

//.toList() - O método toList() é chamado para coletar os elementos do Stream transformado em uma nova lista. A partir do Java 16, é possível utilizar esse método para obter uma lista diretamente.

//Impressão dos números transformados - Por fim, a lista squaredNumbers é percorrida utilizando um loop for-each, e cada número é impresso no console.
