//a classe n pode ser herdada
final class Ultima{
    public void Nada() {
        System.out.println(10);
    }
}

//o metodo não pode ser sobreescrito
class MethFinal{
    final public void methf() {
        System.out.println("Metodo final");
    }
}
public class Main {
    public static void main(String[] args) {
        Ultima u = new Ultima();
        MethFinal mf = new MethFinal();

        u.Nada();
        mf.methf();
    }
    
    
}
