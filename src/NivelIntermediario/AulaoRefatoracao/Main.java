package NivelIntermediario.AulaoRefatoracao;

import NivelIntermediario.AulaoRefatoracao.Constantes.Bijuu;
import NivelIntermediario.AulaoRefatoracao.Familia.Hyuga;
import NivelIntermediario.AulaoRefatoracao.Familia.Uchiha;
import NivelIntermediario.AulaoRefatoracao.Familia.Uzumaki;
import NivelIntermediario.AulaoRefatoracao.Constantes.Estilos;
import NivelIntermediario.AulaoRefatoracao.Constantes.RankNinja;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- UZUMAKI ---------");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 16, Estilos.NINJUTSU, "Konoha", RankNinja.CHUUNIN, Bijuu.KURAMA );
        System.out.println(Naruto.toString());
        Naruto.inteligenciaDeCombate(90);
        Naruto.habilidadeEspecial();

        System.out.println("--------- UCHIHA ---------");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 16, Estilos.NINJUTSU, "Akatsuki", RankNinja.JOUNIN);
        System.out.println(Sasuke.toString());
        Sasuke.inteligenciaDeCombate(120);
        Sasuke.sharinganAtivado();
        Sasuke.habilidadeEspecial();
        System.out.println("---------------------------");
        Uchiha Itachi = new Uchiha("Itachi Uchiha", 25, Estilos.GENJUTSU, "Akatsuki", RankNinja.JOUNIN);
        System.out.println(Itachi.toString());
        Itachi.inteligenciaDeCombate(150);
        Itachi.sharinganAtivado();
        Itachi.habilidadeEspecial();

        System.out.println("--------- Hyuga ---------");
        Hyuga Neji = new Hyuga("Neji Hyuga", 16, Estilos.TAIJUTSU, "Konoha", RankNinja.JOUNIN);
        System.out.println(Neji.toString());
        Neji.inteligenciaDeCombate(125);
        Neji.byakuganAtivado();
        Neji.habilidadeEspecial();
    }

}
