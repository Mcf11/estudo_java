package NivelIntermediario.EstudoRecords;

public class Ninja {
    private final String nome;
    private final int idade;
    private final int telefone;

    public Ninja(String nome, int idade, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getTelefone() {
        return telefone;
    }
}
