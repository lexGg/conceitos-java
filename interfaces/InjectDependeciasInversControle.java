//Exemplo 1: Sem inversão de controle e injeção de dependências
public class Casa {
    private Janela janela;

    public Casa() {
        janela = new Janela();
    }

    public void exibirJanela() {
        janela.exibir();
    }
}

public class Janela {
    public void exibir() {
        System.out.println("Exibindo janela...");
    }
}

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.exibirJanela();
    }
}

/*
Nesse exemplo, a classe Casa cria uma instância da classe Janela 
dentro de seu construtor. Ela possui uma dependência direta da classe Janela,
o que torna o código menos flexível. Se quisermos substituir a janela por uma
diferente, teríamos que modificar a classe Casa.
Agora, vamos ver o exemplo com inversão de controle e injeção de dependências:
*/

public interface Janela {
    void exibir();
}

public class JanelaDeMadeira implements Janela {
    public void exibir() {
        System.out.println("Exibindo janela de madeira...");
    }
}

public class JanelaDeVidro implements Janela {
    public void exibir() {
        System.out.println("Exibindo janela de vidro...");
    }
}

public class Casa {
    private Janela janela;

    public Casa(Janela janela) {
        this.janela = janela;
    }

    public void exibirJanela() {
        janela.exibir();
    }
}

public class Main {
    public static void main(String[] args) {
        Janela janela = new JanelaDeVidro();
        Casa casa = new Casa(janela);
        casa.exibirJanela();
    }
}


/*
Nesse exemplo, temos uma interface Janela que define o contrato para exibir
uma janela. Em seguida, temos duas classes que implementam essa interface: JanelaDeMadeira e JanelaDeVidro.

A classe Casa agora recebe uma instância de Janela no seu construtor. Dessa forma, podemos facilmente mudar o tipo de janela passando uma instância diferente no momento da criação da casa. No exemplo, estamos passando uma instância de JanelaDeVidro.
Essa abordagem torna o código mais flexível, pois não há dependência direta entre Casa e um tipo específico de Janela. Podemos facilmente adicionar novos tipos de janelas sem modificar a classe Casa.
*/
