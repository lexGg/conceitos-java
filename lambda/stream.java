import java.utils
public class {
 static void main(){
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

numbers.stream()
        .filter(n -> n % 2 == 0) // Filtra apenas os números pares
        .forEach(System.out::println); // Imprime os números pares

	List<String> names = Arrays.asList("John", "Alice", "Bob");

List<Integer> nameLengths = names.stream()
        .map(String::length) // Mapeia o tamanho de cada nome
        .collect(Collectors.toList()); // Cria uma nova lista com os tamanhos dos nomes

System.out.println(nameLengths); // Imprime [4, 5, 3]

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

int sum = numbers.stream()
        .reduce(0, Integer::sum); // Soma todos os elementos da lista

System.out.println(sum); // Imprime 15

	List<String> fruits = Arrays.asList("Apple", "Orange", "Banana");

List<String> sortedFruits = fruits.stream()
        .sorted() // Ordena os elementos em ordem alfabética
        .collect(Collectors.toList()); // Cria uma nova lista ordenada

System.out.println(sortedFruits); // Imprime [Apple, Banana, Orange]

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

Optional<Integer> firstEven = numbers.stream()
        .filter(n -> n % 2 == 0) // Filtra apenas os números pares
        .findFirst(); // Encontra o primeiro número par

firstEven.ifPresent(System.out::println); // Imprime 2


}
}
