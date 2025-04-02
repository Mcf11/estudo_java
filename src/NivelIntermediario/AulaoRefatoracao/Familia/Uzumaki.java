package NivelIntermediario.AulaoRefatoracao.Familia;

import NivelIntermediario.AulaoRefatoracao.Constantes.Bijuu;
import NivelIntermediario.AulaoRefatoracao.Ninja;
import NivelIntermediario.AulaoRefatoracao.Constantes.Estilos;
import NivelIntermediario.AulaoRefatoracao.Constantes.RankNinja;

public class Uzumaki extends Ninja {

    // Declarar o enum que sera utilizado somente nessa classe, nova propriedade
    Bijuu bijuu;

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, Estilos estilo, String aldeia,  RankNinja rank) {
        super(nome, idade, estilo, aldeia, rank);
    }

    // Construtor sobrecarregado para conter atributo novo, podemos criar um Uzumaki com ou sem Bijuu
    public Uzumaki(String nome, int idade, Estilos estilo, String aldeia,  RankNinja rank, Bijuu bijuu) {
        super(nome, idade, estilo, aldeia, rank);
        this.bijuu = bijuu;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("RASENGAN -" + getNome());;
    }

    @Override
    public String toString() {
        return "Infos Ninja: " + getNome() + ", " + getIdade() + ", " + getEstilo() + ", " + getAldeia() + ", " + getRank() + "\n" + Bijuu.KURAMA;
    }
}
