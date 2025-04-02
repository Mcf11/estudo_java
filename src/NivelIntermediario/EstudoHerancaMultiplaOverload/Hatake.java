package NivelIntermediario.EstudoHerancaMultiplaOverload;

public class Hatake extends Ninja implements Sharingan, Anbu{
    public Hatake(String nome, int idade, String aldeia, Rank rank, int numeroDeMissoesConcluidas) {
        super(nome, idade, aldeia, rank, numeroDeMissoesConcluidas);
    }
    public Hatake() {
    }
    public Hatake(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void invocarCaes(){
        System.out.println("Cães farejadores de " + nome + " em campo");
    }

    @Override
    public void SharinganAtivado () {
        System.out.println(this.nome + " ativou o Mangekyo Sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Habilidades sinistras de ninja Anbu de " + nome + " ativadas");
    }
}
