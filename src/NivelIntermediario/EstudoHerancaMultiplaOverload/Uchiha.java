package NivelIntermediario.EstudoHerancaMultiplaOverload;

public class Uchiha extends Ninja implements Sharingan{
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }
    public Uchiha(String nome, int idade, String aldeia, Rank rank, int numeroDeMissoesConcluidas) {
        super(nome, idade, aldeia, rank, numeroDeMissoesConcluidas);
    }
    public Uchiha() {
    }

    public void SharinganAtivado () {
        System.out.println(this.nome + " ativou o Mangekyo Sharingan");
    }

}
