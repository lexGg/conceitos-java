import java.io.File;
import java.util.Scanner;

public class ListarDiretoriosArquivos {

    public static void main(String[] args) {
        // Solicita o caminho da pasta ao usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o caminho da pasta: ");
        String caminhoPasta = scanner.nextLine();
        scanner.close();

        // Cria um objeto File com o caminho da pasta informado
        File pasta = new File(caminhoPasta);

        // Lista todos os diretórios presentes na pasta informada
        File[] diretorios = pasta.listFiles(File::isDirectory);

        // Lista todos os arquivos presentes na pasta informada
        File[] arquivos = pasta.listFiles(File::isFile);

        // Exibe os diretórios encontrados
        System.out.println("Diretórios:");
        for (File diretorio : diretorios) {
            System.out.println(diretorio);
        }

        // Exibe os arquivos encontrados
        System.out.println("\nArquivos:");
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }

        // Solicita o nome do novo diretório e seu caminho de destino
        scanner = new Scanner(System.in);
        System.out.print("\nDigite o nome do novo diretório: ");
        String nomeNovoDiretorio = scanner.nextLine();
        System.out.print("Digite o caminho de destino para criar o diretório: ");
        String caminhoDestino = scanner.nextLine();
        scanner.close();

        // Cria o novo diretório no caminho especificado
        File novoDiretorio = new File(caminhoDestino, nomeNovoDiretorio);
        novoDiretorio.mkdir();

        System.out.println("\nDiretório criado com sucesso!");
    }
}
