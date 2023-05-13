import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando um Map (HashMap)
        Map<String, Integer> mapa = new HashMap<>();

        // Adicionando pares chave-valor
        mapa.put("Alice", 25);
        mapa.put("Bob", 30);
        mapa.put("Carol", 27);

        // Obtendo um valor com base em uma chave
        int idadeBob = mapa.get("Bob");
        System.out.println("Idade do Bob: " + idadeBob);

        // Verificando se uma chave existe no Map
        boolean contemAlice = mapa.containsKey("Alice");
        System.out.println("Contém Alice? " + contemAlice);

        // Iterando sobre as chaves do Map
        for (String chave : mapa.keySet()) {
            int valor = mapa.get(chave);
            System.out.println(chave + ": " + valor);
        }

        // Removendo um par chave-valor
        mapa.remove("Carol");

        // Verificando o tamanho do Map
        int tamanho = mapa.size();
        System.out.println("Tamanho do Map: " + tamanho);
    }
}

//Neste exemplo, usamos a implementação HashMap para criar um objeto Map. Adicionamos pares chave-valor usando o método put(), onde a chave é uma String e o valor é um Integer. Em seguida, usamos o método get() para recuperar o valor associado à chave "Bob
