import java.util.*;

public class Conjuntos {
    public static void main(String[] args) {
        // HashSet - Conjunto que não mantém uma ordem específica dos elementos
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1); // Não será adicionado, pois 1 já está presente

        System.out.println(hashSet); // Imprime: [1, 2, 3]
        System.out.println(hashSet.contains(2)); // Verifica se o conjunto contém o elemento 2
        hashSet.remove(3); // Remove o elemento 3 do conjunto
        System.out.println(hashSet.size()); // Retorna o tamanho do conjunto

        hashSet.clear(); // Remove todos os elementos do conjunto
        System.out.println(hashSet); // Imprime: []

        // TreeSet - Conjunto que mantém os elementos ordenados em ordem ascendente
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Maria");
        treeSet.add("João");
        treeSet.add("Ana");

        System.out.println(treeSet); // Imprime: [Ana, João, Maria]

        // LinkedHashSet - Conjunto que mantém a ordem de inserção dos elementos
        Set<Character> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add('a');
        linkedHashSet.add('b');
        linkedHashSet.add('c');

        System.out.println(linkedHashSet); // Imprime: [a, b, c]
        linkedHashSet.remove('b'); // Remove o elemento 'b'
        System.out.println(linkedHashSet); // Imprime: [a, c]

        // Funções adicionais comuns a todos os conjuntos
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);

        conjunto1.addAll(conjunto2); // Adiciona todos os elementos de conjunto2 a conjunto1
        System.out.println(conjunto1); // Imprime: [1, 2, 3, 4]

        conjunto1.retainAll(conjunto2); // Mantém apenas os elementos que estão presentes em ambos os conjuntos
        System.out.println(conjunto1); // Imprime: [2, 3]

        conjunto1.removeAll(conjunto2); // Remove todos os elementos de conjunto2 de conjunto1
        System.out.println(conjunto1); // Imprime: []
    }
}
