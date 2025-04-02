package NivelIntermediario.Abstratas;

public class Main {

    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 16, "Konoha");

        Naruto.jogar();
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalha();

        System.out.println("--------------------------------");

        Uchiha Sasuke = new Uchiha("Itachi Uchiha", 27, "Akatsuki");
        Sasuke.jogar();
        Sasuke.habilidadeEspecial();
        Sasuke.estrategiaDeBatalha();

    }
}
