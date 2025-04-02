package NivelIntermediario.FinalMethods;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    // não pode ser sobrescrito
    final void concentrarChakra(){
        System.out.println(nome + " está concentrando chakra");
    }

    public void tacarKunai(){
        System.out.println(nome + ", arremessou uma Kunai");
    }

    @Override
    public String toString() {
        return "Infos Ninja: " + nome + ", " + idade + ", " + aldeia;
    }
}
