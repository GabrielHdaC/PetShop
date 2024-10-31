public class Cliente {
    private final String nome;        // Nome do cliente
    private final String nomeAnimal;  // Nome do animal de estimação
    private final String tipoAnimal;  // Tipo do animal (ex: cachorro, gato, etc.)

    private static final String NAME_REGEX = "^[A-Za-zÀ-ÿ\\s]+$";

    public Cliente(String nome, String nomeAnimal, String tipoAnimal) {
        if (!isValidName(nome) || !isValidName(nomeAnimal) || !isValidName(tipoAnimal)) {
            throw new IllegalArgumentException("Nome, nome do animal e tipo de animal devem conter apenas letras e não podem estar em branco.");
        }
        this.nome = nome.trim();
        this.nomeAnimal = nomeAnimal.trim();
        this.tipoAnimal = tipoAnimal.trim();
    }

    private boolean isValidName(String value) {
        return value != null && value.matches(NAME_REGEX) && !value.trim().isEmpty();
    }

    public String getNome() {
        return nome;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", Pet: " + nomeAnimal + ", Tipo: " + tipoAnimal;
    }
}
