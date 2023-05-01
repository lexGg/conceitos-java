//so pode ter uma class public no arquivo por isso omito public
/*
Se você remover o modificador public da classe, ela será uma 
classe "default" e, portanto, só poderá ser acessada por outras 
classes que estejam no mesmo pacote (package). 
Como neste caso todas as classes estão no mesmo arquivo, 
elas estão todas no mesmo pacote implícito, e a classe App pode 
acessar as outras classes normalmente. Mas se você quiser separar
 essas classes em arquivos diferentes, é importante manter o 
 modificador public na classe que você quer acessar de fora do pacote.
*/

class Animal{
    public void fazSom(){
        System.out.println("Som do animal...");
    }
}

class Gato extends Animal {
    public void fazSom() {
        System.out.println("Gato faz miau");
    }
    public void mia() {
        System.out.println("miauuu");
    }
}


class Cachorro extends Animal{
    public void fazSom() {
        System.out.println("Cachorro late....");
    }
    public void late() {
        System.out.println("rau rauu");
    }
    
}

public class App {
    public static void main(String[] args) {
        //upcasting
        Animal animal1 = new Gato();
        Animal animal2 = new Cachorro();
        animal1.fazSom();
        animal2.fazSom();

        if (animal1 instanceof Gato) {
            //downcasting instacia da classe pai sendo convertida
            //na classe herdada
            Gato gato = (Gato) animal1;
            gato.mia();
	    //downcasting so pode ser feitos dps do upcasting
        }

        if (animal1 instanceof Cachorro) {
            //essa linha n sera executada
            Cachorro cachorro = (Cachorro) animal1;
        }
        
        
    }
}


