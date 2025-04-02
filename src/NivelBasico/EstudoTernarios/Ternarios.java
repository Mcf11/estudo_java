package NivelBasico.EstudoTernarios;

public class Ternarios {
    public static void main(String[] args) {
        /*
        Reduzir código para condições
        If/Else em uma linha
        variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        */

        short numeroDeMissoes = 15;
        String nivel = (numeroDeMissoes >= 10 && numeroDeMissoes < 30) ? "Esse ninja está apto para fazer a prova de Chunnin" : "Esse ninja tem de fazer mais missões com Gennin";
        System.out.println(nivel);

    }
}
