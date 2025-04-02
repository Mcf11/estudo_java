package NivelBasico.Condicionais;

public class Condicoes {
    public static void main(String[] args) {
        /*
        Passar um ninja de nível de acordo com o número de missões
        */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank = "Gennin";
        int idade = 18;
        boolean hokage = false;
        short numeroDeMissoes = 30;

        if (numeroDeMissoes > 10 && numeroDeMissoes < 50 && idade > 15) {
            System.out.println("O ninja " + nome + " está pronto para passar do nível " + rank);
            rank = "Chunnin";
            System.out.println("Ninja " + nome + " agora tem o cargo " + rank);
        } else if (numeroDeMissoes > 10 && idade < 16 ) {
            System.out.println("O ninja " + nome + " precisa completar 16 anos para realizar a prova para subir de rank");
        } else if (numeroDeMissoes > 50 && idade >= 18){
            rank = "Chunnin";
            System.out.println("O ninja " + nome + " está pronto para passar do nível " + rank);
            rank = "Jounin";
            System.out.println("Ninja " + nome + " agora tem o cargo " + rank);
        } else {
            System.out.println("O ninja não está pronto para passar de nível");
        }
    }
}
