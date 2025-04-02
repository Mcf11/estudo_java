package NivelIntermediario.FinalMethods;

public class Uzumaki extends Ninja {
    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void habilidadeEspecial(){
        System.out.println("RASENGAN!! -" + nome);
    }
}
