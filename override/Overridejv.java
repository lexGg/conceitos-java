public class Overridejv {
    public static void main(String[] args) {
        Sobreposta s = new Sobreposta();
        s.fala();
    }
}

class Falatxt {
    public void fala() {
        System.out.println("Fala original");
        }
            
    }

class Sobreposta extends Falatxt {
    // isso indica q foi sobreescrito o metodo
    @Override
    public void fala() {
        System.out.println("Fala reescrita");
    }
}
