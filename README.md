# README.txt

## Projeto de Cadastro de Clientes e Agendamentos

Este projeto é um sistema simples para cadastrar clientes e seus animais de estimação, além de agendar serviços para esses animais. O sistema é construído em Java e utiliza uma abordagem orientada a objetos.

### Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. **Cliente**
   - **Descrição**: Representa um cliente e as informações sobre seu animal de estimação.
   - **Atributos**:
     - `String nome`: O nome do cliente.
     - `String nomeAnimal`: O nome do animal de estimação.
     - `String tipoAnimal`: O tipo do animal de estimação.
   - **Métodos**:
     - Construtores para criar instâncias da classe.
     - Getters e setters para acessar e modificar os atributos.

2. **ClienteData**
   - **Descrição**: Extensão da classe `Cliente`, adiciona validações para garantir que os nomes não contenham caracteres inválidos.
   - **Atributos**: Os mesmos que a classe `Cliente`.
   - **Métodos**:
     - Construtor que valida os nomes fornecidos.
     - Método de validação `isValidName` para garantir que os nomes sejam válidos.
     - `toString` para representar a informação do cliente em formato legível.

3. **ClienteController**
   - **Descrição**: Controlador que gerencia o cadastro e listagem de clientes.
   - **Atributos**:
     - `List<ClienteData> clientes`: Lista que armazena os clientes cadastrados.
     - `Scanner sc`: Para leitura de dados do console.
   - **Métodos**:
     - `cadastrarCliente()`: Lê dados do console para cadastrar um cliente.
     - `listarClientes()`: Exibe todos os clientes cadastrados.
     - `closeScanner()`: Fecha o Scanner.

4. **Agendamento**
   - **Descrição**: Representa um agendamento de serviço para um cliente e seu animal de estimação.
   - **Atributos**:
     - `String servico`: O tipo de serviço agendado.
     - `StatusAgendamento status`: O status do agendamento (agendado, concluído, cancelado).
     - `Cliente cliente`: O cliente associado ao agendamento.
   - **Métodos**:
     - Construtores e métodos para manipular os atributos.
     - `toString` para representar o agendamento em formato legível.

5. **Main**
   - **Descrição**: Classe principal que inicia a aplicação e gerencia a interação do usuário.
   - **Métodos**:
     - `main(String[] args)`: Método principal que cria o controlador e chama os métodos de cadastro e listagem de clientes.

### Como Executar

1. Compile as classes Java.
2. Execute a classe `Main` para iniciar a aplicação.
3. Siga as instruções no console para cadastrar clientes e listar os clientes cadastrados.

### Requisitos

- JDK 8 ou superior.
- Um ambiente de desenvolvimento Java (IDE) como Eclipse, IntelliJ IDEA ou um editor de texto com suporte a Java.

### Notas

- Certifique-se de que as entradas estejam de acordo com as validações estabelecidas nas classes.
- Para futuras melhorias, considere adicionar funcionalidades como a edição e remoção de clientes, agendamento de serviços, e persistência de dados em um banco de dados.

### Contribuições

Contribuições são bem-vindas! Se você tiver sugestões ou melhorias, sinta-se à vontade para abrir um "issue" ou "pull request".

