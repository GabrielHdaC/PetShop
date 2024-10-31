import java.util.List;

public class Agendamento {
    private final Servicos servico;       // Serviço a ser realizado
    private StatusAgendamento status;     // Status do agendamento (imutável após criação)
    private final ClienteData cliente;    // Cliente associado ao agendamento

    public Agendamento(Servicos servico, ClienteData cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }
        this.servico = servico;
        this.status = StatusAgendamento.AGENDADO;
        this.cliente = cliente;
        this.cliente.adicionarServicos(List.of(servico)); // Marca o cliente como agendado
    }

    public Servicos getServico() {
        return servico;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public ClienteData getCliente() {
        return cliente;
    }

    public void concluirAgendamento() {
        this.status = StatusAgendamento.CONCLUIDO;
        this.cliente.removerServico(servico); // Marca o cliente como não agendado se não houver mais serviços
    }

    public void cancelarAgendamento() {
        this.status = StatusAgendamento.CANCELADO;
        this.cliente.removerServico(servico); // Marca o cliente como não agendado se não houver mais serviços
    }

    @Override
    public String toString() {
        return "Agendamento: [Serviço: " + servico + ", Status: " + status + ", Cliente: " + cliente.getNome() + "]";
    }

    public enum StatusAgendamento {
        AGENDADO,
        CONCLUIDO,
        CANCELADO
    }

    public enum Servicos {
        BANHO,
        TOSA,
        VETERINARIO,  // Expansão para outros serviços
        VACINACAO
    }
}
