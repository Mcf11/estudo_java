package NivelIntermediario.FinalMethods;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 16, "Konoha");
        System.out.println(Naruto.toString());
        Naruto.concentrarChakra();
        Naruto.habilidadeEspecial();
        Naruto.tacarKunai();

        System.out.println("--------------------------------------------------");

        Uchiha Itachi = new Uchiha("Itachi Uchiha", 16, "Akatsuki");
        System.out.println(Itachi.toString());
        Itachi.concentrarChakra();
        Itachi.habilidadeEspecial();
        Itachi.tacarKunai();

    }

}
