package NivelIntermediario.Abstratas;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void jogar(){
        System.out.println(nome + " jogou o caralho de uma Kunai na puta que pariu");
    }

    // Pegamos aqui da Interface, precisamos especificar aqui
    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Carrega o Rasengan com um clone no cantinho");
    }
}
