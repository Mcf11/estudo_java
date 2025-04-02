package NivelIntermediario.AulaoRefatoracao.Familia;

import NivelIntermediario.AulaoRefatoracao.Constantes.Estilos;
import NivelIntermediario.AulaoRefatoracao.Constantes.RankNinja;
import NivelIntermediario.AulaoRefatoracao.Ninja;
import NivelIntermediario.AulaoRefatoracao.Oculares.Byakugan;

public class Hyuga extends Ninja implements Byakugan {
    public Hyuga() {
    }

    public Hyuga(String nome, int idade, Estilos estilo, String aldeia, RankNinja rank) {
        super(nome, idade, estilo, aldeia, rank);
    }

    @Override
    public void byakuganAtivado() {
        System.out.println("BYAKUGAN! -" + getNome());
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("JUKEN! -" + getNome());
    }

}
