public class Caixa<T> {
    private T objeto;

    public void armazenar(T objeto) {
        this.objeto = objeto;
    }

    public T obter() {
        return objeto;
    }
}

Caixa<?> caixa = new Caixa<>();
caixa.armazenar("Olá, mundo!");
Object objeto = caixa.obter();
System.out.println(objeto); // Imprime: Olá, mundo!

//Aqui, usamos o tipo curinga <?> para criar uma instância da classe Caixa sem especificar o tipo. Isso permite que a caixa armazene qualquer tipo de objeto. Ao obter o objeto da caixa, o tipo retornado é Object, pois não temos informações específicas sobre o tipo.

//O uso do tipo curinga nos permite escrever código genérico que pode ser reutilizado com diferentes tipos, mas com algumas limitações. Por exemplo, não podemos adicionar elementos à caixa com tipo curinga, pois não temos conhecimento suficiente sobre o tipo específico.
