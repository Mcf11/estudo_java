package NivelIntermediario.Desafio3;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.habilidade.toUpperCase() + "!!! -" + this.nome);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Infos ninja: " + this.nome + ", " + this.idade + ", habilidade especial: " + this.habilidade + ", especialidade: " + this.especialidade);
    }


}
