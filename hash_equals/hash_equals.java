public class Person {
    private String name;
    private int age;
    
    // Construtor e outros métodos da classe Person
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // Verifica se as referências são as mesmas
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { // Verifica se o objeto é nulo ou pertence a uma classe diferente
            return false;
        }
        
        Person person = (Person) obj; // Faz o casting do objeto para a classe Person
        
        // Verifica se os atributos são iguais
        return age == person.age && name.equals(person.name);
    }
    
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}

/*Nesse exemplo, a classe Person tem dois atributos: name (nome) e age (idade). O método equals foi sobrescrito para comparar dois objetos Person com base em seus nomes e idades.
O método hashCode também foi sobrescrito para gerar um valor de hashcode único com base nos atributos name e age.*/

Person person1 = new Person("João", 25);
Person person2 = new Person("João", 25);

System.out.println(person1.equals(person2)); // Imprime true
System.out.println(person1.hashCode() == person2.hashCode()); // Imprime true

/*Nesse exemplo, mesmo que person1 e person2 sejam dois objetos diferentes, eles têm o mesmo nome e a mesma idade, portanto, o equals retorna true. Além disso, seus hashCodes são iguais.
Em resumo, hashCode é usado para otimizar a pesquisa de objetos*/
