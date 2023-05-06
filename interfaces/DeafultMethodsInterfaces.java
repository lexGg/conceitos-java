/*
O método padrão será utilizado como uma implementação padrão caso a classe que implementa a interface não forneça sua própria implementação.

Aqui está um exemplo que ilustra isso:
*/

public interface Animal {
    default void emitirSom() {
        System.out.println("Animal emitindo som...");
    }
}

public class Cachorro implements Animal {
    // Não há necessidade de sobrescrever o método emitirSom() aqui
}

public class Gato implements Animal {
    // Não há necessidade de sobrescrever o método emitirSom() aqui
}


public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();  // Saída: Animal emitindo som...

        Animal gato = new Gato();
        gato.emitirSom();  // Saída: Animal emitindo som...
    }
}


//Nesse caso, como as classes Cachorro e Gato não sobrescrevem o método emitirSom(), a implementação padrão da interface Animal é executada quando o método é chamado em instâncias dessas classes.
