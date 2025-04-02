package NivelIntermediario.AulaoRefatoracao.Familia;

import NivelIntermediario.AulaoRefatoracao.Ninja;
import NivelIntermediario.AulaoRefatoracao.Constantes.Estilos;
import NivelIntermediario.AulaoRefatoracao.Constantes.RankNinja;
import NivelIntermediario.AulaoRefatoracao.Oculares.Sharingan;

public class Uchiha extends Ninja implements Sharingan {
    public Uchiha() {
    }

    public Uchiha(String nome, int idade, Estilos estilo, String aldeia, RankNinja rank) {
        super(nome, idade, estilo, aldeia, rank);
    }

    @Override
    public void sharinganAtivado(){
        System.out.println(getNome() + " ativou o Mangekyo Sharingan");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Katon: Gōkakyū no Jutsu -" + getNome());
    }
}
