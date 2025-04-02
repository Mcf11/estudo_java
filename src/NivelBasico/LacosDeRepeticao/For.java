package NivelBasico.LacosDeRepeticao;

public class For {
    public static void main(String[] args) {
        /*
        Laços de repetição que repetirão até atingir uma condição especificada
        While e For
        */

        int numeroDeClones = 1;                   // Se começar em 0 o programa rodará uma vez com 0
        int numeroMaximoDeClones = 40;

        while(numeroDeClones <= numeroMaximoDeClones){
            System.out.println("O Naruto fez um clone das sombras, quantidade de clones: " + numeroDeClones);
            numeroDeClones++;
        }

        for (int i = 1; i < numeroDeClones; i++) {
            System.out.println("O Obito fez um clone das sombras, quantidade de clones: " + i);
        }
    }
}
