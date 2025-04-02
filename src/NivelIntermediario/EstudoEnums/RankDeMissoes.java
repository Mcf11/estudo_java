package NivelIntermediario.EstudoEnums;

public enum RankDeMissoes {
    D("baixíssima", 2),
    C("baixa", 3),
    B("moderada", 5),
    A("alta", 6),
    S("elite", 8),
    SS("apocalipse", 10),;

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    // Getters pra mostrar descrição e dificuldade pro usuario
    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
