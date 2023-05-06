import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploFileWriter {
    public static void main(String[] args) {
        // Texto a ser escrito no arquivo
        String texto = "Olá, mundo!";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt"))) {
            // Cria um BufferedWriter, que recebe um FileWriter para escrever no arquivo "arquivo.txt"
            // O uso do try-with-resources garante que o BufferedWriter será fechado automaticamente

            // Escreve o texto no arquivo
            writer.write(texto);
        } catch (IOException e) {
            // Trata a exceção de IO, caso ocorra algum erro na escrita do arquivo
            System.out.println("Ocorreu um erro ao tentar escrever no arquivo: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt", true))) {
            // Cria um BufferedWriter, que recebe um FileWriter com a flag "true" para adicionar conteúdo ao arquivo existente
            // O uso do try-with-resources garante que o BufferedWriter será fechado automaticamente

            // Escreve mais texto no arquivo, adicionando ao conteúdo existente
            writer.write(" - Exemplo adicional");
        } catch (IOException e) {
            // Trata a exceção de IO, caso ocorra algum erro na escrita do arquivo
            System.out.println("Ocorreu um erro ao tentar escrever no arquivo: " + e.getMessage());
        }
    }
}
