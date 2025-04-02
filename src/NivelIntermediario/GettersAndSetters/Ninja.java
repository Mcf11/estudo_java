package NivelIntermediario.GettersAndSetters;

public abstract class Ninja {
    private String nome;
    private int idade;
    private String aldeia;
    private int numeroMissoes;
    private double rate;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia, int numeroMissoes, double rate) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.numeroMissoes = numeroMissoes;
        this.rate = rate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getNumeroMissoes() {
        return numeroMissoes;
    }

    public void setNumeroMissoes(int numeroMissoes) {
        this.numeroMissoes = numeroMissoes;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", aldeia='" + aldeia + '\'' +
                ", numeroMissoes=" + numeroMissoes +
                ", rate=" + rate +
                '}';
    }
}
