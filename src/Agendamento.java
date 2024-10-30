/**
 * A classe Agendamento representa um agendamento de serviço para um cliente.
 * Esta classe contém informações sobre o serviço a ser prestado, o status do agendamento
 * e os dados do cliente.
 */
public class Agendamento {
    private String servico;                // O serviço a ser agendado
    private StatusAgendamento status;      // O status do agendamento (agendado, concluído, cancelado)
    private Cliente cliente;                // O cliente associado ao agendamento

    /**
     * Construtor da classe Agendamento.
     *
     * @param servico  O serviço a ser agendado.
     * @param status   O status inicial do agendamento.
     * @param cliente  O cliente associado ao agendamento.
     */
    public Agendamento(String servico, StatusAgendamento status, Cliente cliente) {
        this.servico = servico;
        this.status = status;  // Usa o tipo seguro de enum
        this.cliente = cliente;
    }

    // Métodos getters e setters

    /**
     * Retorna o serviço associado ao agendamento.
     *
     * @return O serviço a ser prestado.
     */
    public String getServico() {
        return servico;
    }

    /**
     * Define o serviço associado ao agendamento.
     *
     * @param servico O novo serviço a ser prestado.
     */
    public void setServico(String servico) {
        this.servico = servico;
    }

    /**
     * Retorna o status do agendamento.
     *
     * @return O status atual do agendamento.
     */
    public StatusAgendamento getStatus() {
        return status;
    }

    /**
     * Define o status do agendamento.
     *
     * @param status O novo status a ser definido para o agendamento.
     */
    public void setStatus(StatusAgendamento status) {
        this.status = status;  // Usa o tipo seguro de enum
    }

    /**
     * Retorna o cliente associado ao agendamento.
     *
     * @return O cliente relacionado ao agendamento.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente associado ao agendamento.
     *
     * @param cliente O novo cliente a ser associado ao agendamento.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Retorna uma representação em String do objeto Agendamento.
     *
     * @return Uma string formatada com os detalhes do agendamento.
     */
    @Override
    public String toString() {
        return "Agendamento: [Serviço: " + servico + ", Status: " + status + ", Cliente: " + cliente.getNome() + "]";
    }

    /**
     * Enum que representa os diferentes status de um agendamento.
     */
    public enum StatusAgendamento {
        AGENDADO,    // O agendamento foi criado
        CONCLUIDO,   // O agendamento foi concluído
        CANCELADO    // O agendamento foi cancelado
    }
}
