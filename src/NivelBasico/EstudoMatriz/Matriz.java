package NivelBasico.EstudoMatriz;

public class Matriz {
    public static void main(String[] args) {
        String[][] ninjas = new String[3][3];

        ninjas[0][0] = "Konoha";
        ninjas[0][1] = "Naruto Uzumaki";
        ninjas[0][2] = "Kakashi Hatake";

        ninjas[1][0] = "Trevas";
        ninjas[1][1] = "Severus Snape";
        ninjas[1][2] = "Voldemort";

        ninjas[2][0] = "Amor";
        ninjas[2][1] = "Gil do Vigor";
        ninjas[2][2] = "Ney MatoSeco";

        for (int i = 0; i < ninjas.length; i++){
            System.out.println("Aldeia: " + ninjas[i][0]);
            System.out.println("Ninja 1: " + ninjas[i][1]);
            System.out.println("Ninja 2: " + ninjas[i][2]);
        }
    }
}
