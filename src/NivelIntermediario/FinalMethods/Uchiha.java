package NivelIntermediario.FinalMethods;

public class Uchiha extends Ninja{
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void habilidadeEspecial(){
        System.out.println("Katon Gōkakyū no Jutsu -" + nome);
    }

    @Override
    public void tacarKunai(){
        System.out.println(nome + " arremessou Kunai com selo de fogo");

    }
}
