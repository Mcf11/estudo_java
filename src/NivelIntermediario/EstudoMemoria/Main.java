package NivelIntermediario.EstudoMemoria;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 16, "Akatsuki");
        Sasuke.infosNinja();
        Sasuke.SharinganAtivado();
        System.out.println(Sasuke);

        System.out.println("--------------------------------------");

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 16, "Konoha");
        Naruto.infosNinja();
        Naruto.habilidade();
        System.out.println(Naruto.toString()); // To String editada no Ninja


    }
}
