/* Interfaces:
Em Java, uma interface é um contrato que define um conjunto de métodos que uma classe deve implementar.
Uma interface é declarada usando a palavra-chave interface.
As classes que implementam uma interface devem fornecer uma implementação para todos os métodos definidos na interface.
As interfaces permitem que você defina um contrato comum para várias classes relacionadas.
Exemplo:
*/

interface Animal {
    void emitirSom();
}

class Cachorro implements Animal {
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato implements Animal {
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();  // Saída: Au au!

        Animal gato = new Gato();
        gato.emitirSom();  // Saída: Miau!
    }
}
