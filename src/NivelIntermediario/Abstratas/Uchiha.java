package NivelIntermediario.Abstratas;

public class Uchiha extends Ninja {

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void jogar(){
        System.out.println(nome + " jogou o caralho de uma Shuriken na puta que pariu");
    }

    // Pegamos aqui da Interface, precisamos especificar aqui
    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Chidori neles");
    }
}
