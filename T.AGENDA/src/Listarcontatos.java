import java.util.ArrayList;
import java.util.Scanner;

public class Listarcontatos {
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<String> telefones = new ArrayList<>();

    while (true) {
        System.out.println("\n===== MENU AGENDA =====");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Buscar telefone por nome");
        System.out.println("3 - Listar todos os contatos");
        System.out.println("4 - Remover contato");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.print("Nome do contato: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone do contato: ");
            String telefone = scanner.nextLine();

            nomes.add(nome);
            telefones.add(telefone);
            System.out.println("Contato adicionado!");
        }

        else if (opcao == 2) {
            System.out.print("Nome do contato a buscar: ");
            String nome = scanner.nextLine();
            int index = nomes.indexOf(nome);
            if (index != -1) {
                System.out.println("Telefone: " + telefones.get(index));
            } else {
                System.out.println("Contato não encontrado.");
            }
        }

        else if (opcao == 3) {
            if (nomes.isEmpty()) {
                System.out.println("Nenhum contato salvo.");
            } else {
                System.out.println("\n--- Lista de Contatos ---");
                for (int i = 0; i < nomes.size(); i++) {
                    System.out.println("Nome: " + nomes.get(i) + " | Telefone: " + telefones.get(i));
                }
            }
        }
    }
}


