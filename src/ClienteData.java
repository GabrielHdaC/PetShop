import java.util.ArrayList;
import java.util.List;

public class ClienteData {
    private String nome;          // Nome do cliente
    private String nomeAnimal;    // Nome do animal de estimação
    private String tipoAnimal;    // Tipo do animal (ex: cachorro, gato, etc.)
    private List<Agendamento.Servicos> servicos; // Serviços solicitados
    private boolean agendado;     // Status do agendamento (true para agendado, false para não agendado)

    private static final String NAME_REGEX = "^[A-Za-zÀ-ÿ\\s]+$";

    public ClienteData(String nome, String nomeAnimal, String tipoAnimal) {
        if (!isValidName(nome) || !isValidName(nomeAnimal) || !isValidName(tipoAnimal)) {
            throw new IllegalArgumentException("Nome, nome do animal e tipo de animal devem conter apenas letras e não podem estar em branco.");
        }
        this.nome = nome.trim();
        this.nomeAnimal = nomeAnimal.trim();
        this.tipoAnimal = tipoAnimal.trim();
        this.servicos = new ArrayList<>();
        this.agendado = false; // Inicialmente, o agendamento é false
    }

    private boolean isValidName(String value) {
        return value != null && value.matches(NAME_REGEX) && !value.trim().isEmpty();
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public List<Agendamento.Servicos> getServicos() {
        return servicos;
    }

    public boolean isAgendado() {
        return agendado;
    }

    // Método para adicionar serviços e definir o status do agendamento
    public void adicionarServicos(List<Agendamento.Servicos> novosServicos) {
        for (Agendamento.Servicos servico : novosServicos) {
            if (!servicos.contains(servico)) {
                servicos.add(servico);
            } else {
                System.out.println("O serviço " + servico + " já está agendado.");
            }
        }
        this.agendado = !this.servicos.isEmpty();
    }

    public void removerServico(Agendamento.Servicos servico) {
        servicos.remove(servico);
        this.agendado = !this.servicos.isEmpty();
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", Pet: " + nomeAnimal + ", Tipo: " + tipoAnimal + ", Serviços: " + servicos + ", Agendado: " + (agendado ? "Sim" : "Não");
    }
}
