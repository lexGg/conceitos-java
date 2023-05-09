//Em Java, generics são usados para tornar as classes e métodos mais flexíveis e reutilizáveis, permitindo que eles trabalhem com diferentes tipos de dados de forma segura. É como ter uma caixa que pode ser usada para armazenar qualquer tipo de objeto, mas ainda mantendo a noção do tipo de objeto que está sendo armazenado.

//Vamos supor que temos uma classe chamada "Caixa" que pode armazenar qualquer tipo de objeto. Usando generics, podemos criar uma caixa que especifica qual tipo de objeto ela pode armazenar.

//Exemplo de generics:

public class Caixa<T> {
    private T objeto;

    public void armazenar(T objeto) {
        this.objeto = objeto;
    }

    public T obter() {
        return objeto;
    }
}


//Aqui, a letra "T" é um tipo genérico que pode ser substituído por qualquer tipo de objeto. Agora podemos criar uma caixa que armazena strings:

Caixa<String> caixaDeString = new Caixa<>();
caixaDeString.armazenar("Olá, mundo!");
String texto = caixaDeString.obter();
System.out.println(texto); // Imprime: Olá, mundo!

//Dessa forma, a caixa pode ser usada para armazenar apenas objetos do tipo String.

//Agora, vamos falar sobre generics delimitados. Isso permite restringir o tipo de objeto que pode ser usado como argumento genérico para a classe ou método, baseado em uma hierarquia de classes.

//Exemplo de generics delimitados:

public class CaixaNumerica<T extends Number> {
    private T numero;

    public void armazenar(T numero) {
        this.numero = numero;
    }

    public T obter() {
        return numero;
    }
}

//Neste exemplo, a classe CaixaNumerica só aceita tipos numéricos como argumento genérico. Isso significa que podemos usar a caixa para armazenar apenas números.

CaixaNumerica<Integer> caixaDeInteiro = new CaixaNumerica<>();
caixaDeInteiro.armazenar(42);
Integer valor = caixaDeInteiro.obter();
System.out.println(valor); // Imprime: 42

//Aqui, a caixa pode ser usada apenas para armazenar números inteiros, pois o tipo genérico é limitado às subclasses de Number.

//Esses são exemplos básicos para ilustrar o conceito de generics e generics delimitados em Java. Espero que tenha sido compreensível!
