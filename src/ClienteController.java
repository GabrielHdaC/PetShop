import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteController {
    private List<ClienteData> clientes = new ArrayList<>();

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o nome do animal de estimação: ");
        String nomeAnimal = scanner.nextLine();
        System.out.print("Digite o tipo do animal: ");
        String tipoAnimal = scanner.nextLine();

        ClienteData cliente = new ClienteData(nome, nomeAnimal, tipoAnimal);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");

        List<Agendamento.Servicos> servicos = new ArrayList<>();
        int opcao;
        do {
            System.out.print("Deseja agendar um serviço? (1-Banho, 2-Tosa, 3-Veterinario, 4-Vacinacao, 0-Não): ");
            opcao = scanner.nextInt();
            if (opcao > 0 && opcao <= 4) {
                Agendamento.Servicos servico = Agendamento.Servicos.values()[opcao - 1];
                if (!cliente.getServicos().contains(servico)) {
                    servicos.add(servico);
                } else {
                    System.out.println("O serviço " + servico + " já está agendado. Escolha outro serviço.");
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);

        if (!servicos.isEmpty()) {
            cliente.adicionarServicos(servicos);
            System.out.println("Serviços agendados com sucesso!");
        }
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (ClienteData cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}
