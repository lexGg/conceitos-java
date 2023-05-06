import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader("arquivo.txt"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar abrir o arquivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Ocorreu um erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }
}
