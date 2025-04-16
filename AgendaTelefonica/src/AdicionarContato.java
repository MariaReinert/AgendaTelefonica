import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AdicionarContato {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> telefones = new ArrayList<>();

        int proximold = 1;

        while (true) {
            System.out.println("\n ##### MENU #####");
            System.out.println("1 - Adicionar novo contato (nome e telefone)");
            System.out.println("2 - Listar todos os contatos");
            System.out.println("3 - BUSCAR TELEFONE POR NOME");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println(" Nome do contato ");

                String nome = scanner.nextLine();
                System.out.println("Número de telefone:");

                double telefone = scanner.nextDouble();

                ids.add(proximold++);
                nomes.add(nome);
                telefones.add(telefone);

                System.out.println("Contato cadastrado com sucesso!");
            }
        }
    }
}