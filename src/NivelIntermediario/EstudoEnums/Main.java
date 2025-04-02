package NivelIntermediario.EstudoEnums;

public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgatar um doguito tão bonitito", RankDeMissoes.D);
        missao1.exibirDetalhes();

        System.out.println("--------------------------------------");

        Missoes missao2 = new Missoes("Derrotar o Zabuza Momochi", RankDeMissoes.A);
        missao2.exibirDetalhes();
    }
}
