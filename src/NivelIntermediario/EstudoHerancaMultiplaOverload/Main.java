package NivelIntermediario.EstudoHerancaMultiplaOverload;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 16, "Akatsuki", Rank.JOUNIN, 1500);
        Sasuke.missions();
        Sasuke.SharinganAtivado();
        Sasuke.inteligenciaDeCombate(140);

        System.out.println("----------------------------------------");

        Hatake Kakashi = new Hatake("Kakashi Hatake", 33, "Konoha", Rank.HOKAGE, 5000);
        Kakashi.missions();
        Kakashi.invocarCaes();
        Kakashi.SharinganAtivado();
        Kakashi.ninjaDeElite();
        Kakashi.inteligenciaDeCombate(120);

        System.out.println("----------------------------------------");

        Uchiha Itachi = new Uchiha("Itachi Uchiha", 26, "Akatsuki", Rank.JOUNIN, 200);
        Itachi.missions();
        Itachi.SharinganAtivado();
        Itachi.inteligenciaDeCombate(115);

        System.out.println("----------------------------------------");

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 16, "Konoha", Rank.CHUUNIN, 900);
        Naruto.missions();
        Naruto.habilidadeEspecial();
        Naruto.Rasengan();
        Naruto.inteligenciaDeCombate(80);

    }




}
