import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Colecionavel {
    String getDescricao();
    String getNome();
}

class Produto implements Colecionavel {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String getDescricao() {
        return "Produto: " + nome + " (ID: " + id + ")";
    }

    // Getters e Setters (métodos de acesso)
    // Não adicionei pra simplificar ja que não estou usando
    @Override
    public String getNome() {
        return nome;
    }
}

public class Principal {
    private static List<Colecionavel> colecionaveis = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto(scanner);
                    break;
                case 2:
                    listarColecionaveis();
                    break;
                case 3:
                    pesquisarColecionavel(scanner);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o programa! Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Listar colecionáveis");
        System.out.println("3. Pesquisar colecionável");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarProduto(Scanner scanner) {
        try {
            System.out.println("Informe o id do produto:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Informe o preço:");
            double preco = scanner.nextDouble();

            System.out.println("Informe a quantidade:");
            int quantidade = scanner.nextInt();

            Colecionavel produto = new Produto(id, nome, preco, quantidade);

            colecionaveis.add(produto);

            System.out.println("Produto adicionado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar produto. Verifique os dados informados.");
        }
    }

    private static void listarColecionaveis() {
        System.out.println("------ LISTA DE COLECIONÁVEIS ------");
        if (colecionaveis.isEmpty()) {
            System.out.println("Nenhum colecionável cadastrado");
        } else {
            for (Colecionavel colecionavel : colecionaveis) {
                System.out.println(colecionavel.getDescricao());
            }
        }
    }

    private static void pesquisarColecionavel(Scanner scanner) {
        System.out.println("Digite o nome do colecionável que deseja pesquisar: ");
        String nomePesquisa = scanner.nextLine();

        boolean encontrado = false;

        System.out.println("------ RESULTADO DA PESQUISA ------");
        for (Colecionavel colecionavel : colecionaveis) {
            if (colecionavel.getNome().equalsIgnoreCase(nomePesquisa)) {
                System.out.println(colecionavel.getDescricao());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Colecionável não encontrado na lista");
        }
    }
}
