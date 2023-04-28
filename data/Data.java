import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        // Criar objeto LocalDateTime com a data e hora atual
        LocalDateTime dataAtual = LocalDateTime.now();
        
        // Adicionar 4 horas à data atual
        LocalDateTime dataAtualMais4Horas = dataAtual.plusHours(4);
        
        // Criar um objeto DateTimeFormatter com o formato desejado (dd/MM/yyyy HH:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        // Imprimir a data atual formatada com o DateTimeFormatter
        System.out.println("Data atual: " + dataAtual.format(formatter));
        
        // Imprimir a data atual mais 4 horas formatada com o DateTimeFormatter
        System.out.println("Data atual mais 4 horas: " + dataAtualMais4Horas.format(formatter));
    }
}
