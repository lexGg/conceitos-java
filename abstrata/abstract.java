public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}

//Uma classe abstrata é um modelo para outras classes e não pode ser 
//instanciada diretamente. As classes filhas devem implementar os métodos
//abstratos definidos na classe abstrata. Os métodos abstratos são 
//declarados na classe abstrata, mas não têm implementação definida,
//e são implementados pelas classes filhas que estendem a classe abstrata.
