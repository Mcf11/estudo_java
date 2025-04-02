package NivelIntermediario.EstudoHerancaMultiplaOverload;

public class Uzumaki extends Ninja{
    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, int idade, String aldeia, Rank rank, int numeroDeMissoesConcluidas) {
        super(nome, idade, aldeia, rank, numeroDeMissoesConcluidas);
    }

    public Uzumaki() {
    }

    public void habilidadeEspecial(){
        System.out.println(nome + " ativou o poder do protagonismo");
    }
    public void Rasengan(){
        System.out.println("Rasengan -" + nome);
    }

}
