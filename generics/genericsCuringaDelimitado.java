/* Os wildcards delimitados são usados para restringir o tipo de parâmetro genérico que uma classe ou método pode aceitar. Existem dois tipos de wildcards delimitados: o wildcard superior (? extends Tipo) e o wildcard inferior (? super Tipo).

Wildcard Superior (? extends Tipo):
Especifica que o tipo genérico deve ser uma subclasse de Tipo ou o próprio Tipo.
Permite a leitura de objetos do tipo genérico, mas não a escrita.
É útil quando queremos trabalhar com uma coleção de objetos de um tipo específico ou de suas subclasses.
Exemplo: */

public void imprimirElementos(List<? extends Number> lista) {
    for (Number elemento : lista) {
        System.out.println(elemento);
    }
}

List<Integer> inteiros = Arrays.asList(1, 2, 3);
imprimirElementos(inteiros);

List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
imprimirElementos(doubles);

//Nesse exemplo, o método imprimirElementos aceita uma lista de qualquer tipo que seja uma subclasse de Number. Isso nos permite passar uma lista de Integer ou Double, pois ambos são subtipos de Number.

public void adicionarObjeto(Caixa<? super Integer> caixa, Integer objeto) {
    caixa.armazenar(objeto);
}

Caixa<Object> caixaDeObjetos = new Caixa<>();
adicionarObjeto(caixaDeObjetos, 10);

Caixa<Number> caixaDeNumeros = new Caixa<>();
adicionarObjeto(caixaDeNumeros, 20);

Caixa<Integer> caixaDeInteiros = new Caixa<>();
adicionarObjeto(caixaDeInteiros, 30);

//Nesse exemplo, o método adicionarObjeto recebe um objeto Caixa com um tipo genérico delimitado como ? super Integer. Isso significa que a classe Caixa pode ser do tipo Integer ou uma superclasse de Integer, como Number ou Object.

//Ao chamar o método adicionarObjeto, podemos passar uma instância de Caixa com um tipo genérico Object, Number ou Integer. Dessa forma, podemos armazenar um objeto do tipo Integer ou suas subclasses nas respectivas instâncias de Caixa.

//Em resumo, o uso do super em ? super Tipo nos permite escrever objetos do tipo genérico em uma coleção ou classe, abrangendo os tipos Tipo e suas superclasses.





