package NivelIntermediario.AulaoRefatoracao;

import NivelIntermediario.AulaoRefatoracao.Constantes.Estilos;
import NivelIntermediario.AulaoRefatoracao.Constantes.RankNinja;

public abstract class Ninja {
    private String nome;
    private int idade;
    private String aldeia;
    private Estilos estilo;
    private RankNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, int idade, Estilos estilo, String aldeia,  RankNinja rank) {
        this.nome = nome;
        this.idade = idade;
        this.estilo = estilo;
        this.aldeia = aldeia;
        this.rank = rank;
    }

    public void habilidadeEspecial(){
        System.out.println(getNome() + " tacou uma kunai");
    }

    public void inteligenciaDeCombate(){
        System.out.println("QI do ninja não calculado");
    }

    public void inteligenciaDeCombate(int qi){
        if (qi > 80 && qi < 90){
            System.out.println("QI: " + qi + ", lerdão demais, morra por alguém");
        } else if (qi >= 90 && qi < 110){
            System.out.println("QI: " + qi + ", ninja padrão");
        } else if (qi >= 110 && qi < 120){
            System.out.println("QI: " + qi + ", ninja qualificado");
        } else if (qi >= 120 && qi < 140){
            System.out.println("QI: " + qi + ", ninja especialista");
        } else if (qi >= 140){
            System.out.println("QI: " + qi + ", gênio do jutsu");
        } else {
            System.out.println("O ninja é uma ameba");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public Estilos getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilos estilo) {
        this.estilo = estilo;
    }

    public RankNinja getRank() {
        return rank;
    }

    public void setRank(RankNinja rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Infos Ninja: " + getNome() + ", " + getIdade() + ", " + getEstilo() + ", " + getAldeia() + ", " + getRank();
    }
}
