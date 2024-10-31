public class Main {
    public static void main(String[] args) {
        // Cria uma nova instância de ClienteController para gerenciar clientes
        ClienteController controller = new ClienteController();

        // Realizar o cadastro de clientes
        controller.cadastrarCliente(); // Lê dados do console para cadastrar um cliente


        // Listar clientes cadastrados
        controller.listarClientes();
    }
}
