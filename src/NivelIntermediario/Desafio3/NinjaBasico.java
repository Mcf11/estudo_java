package NivelIntermediario.Desafio3;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.habilidade.toUpperCase() + "!!! -" + this.nome);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Infos ninja: " + this.nome + ", " + this.idade + ", habilidade especial: " + this.habilidade);
    }
}
