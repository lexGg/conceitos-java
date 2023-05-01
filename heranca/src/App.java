class Animal {
    protected int vida;
    protected int pata;
    protected int dentes;
    
    public Animal(int vida, int pata, int dentes) {
        setVida(vida);
        setPata(pata);
        setDentes(dentes);
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getPata() {
        return pata;
    }
    public void setPata(int pata) {
        this.pata = pata;
    }
    public int getDentes() {
        return dentes;
    }
    public void setDentes(int dentes) {
         this.dentes = dentes;
    }

    
}

 class Coelho extends Animal {
    private String selvagem;
    public Coelho(int vida, int pata, int dente, String string){
        super(vida, pata, dente);
        this.selvagem = string;
    }

    public void statusCoelho() {
        System.out.printf("Sou um coelho com %d dentes %n%d patas e so tenho %d vida :(", dentes, pata, vida);
        System.out.printf("%n%s sou selvagem%n%n", selvagem);
        System.out.println("Estou comendo cenoura");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Coelho c1 ;
        c1 = new Coelho(1,4,12,"não");
        c1.statusCoelho();

        
    }
}
