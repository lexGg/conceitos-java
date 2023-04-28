
enum Cor{
    VERDE,
    AZUL,
    CINZA,
    PRETO
}

class Carro {
    private Cor cor;
    public Carro(Cor cor) {
        this.cor = cor;
    }

    public void status() {
        System.out.println(this.cor);
    }
}


public class enumeracao {
    public static void main(String[] args) {
        System.out.println("ENUMERAÇÕES");
        Carro car = new Carro(Cor.AZUL);
        System.out.printf("Cor do carro:");
        car.status();
        
    }
}
