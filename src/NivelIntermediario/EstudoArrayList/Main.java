package NivelIntermediario.EstudoArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Narutinho";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println(ninjasArray[0]);

        // Iniciando lista
        List<String> ninjasList = new ArrayList<>();

        // Adicionar
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Tobirama Senju");
        System.out.println(ninjasList);

        // Remover
        ninjasList.remove("Naruto Uzumaki");
        System.out.println(ninjasList);
        ninjasList.add("SASUKE");

        ninjasList.set(1, "HASHIRAMA");
        System.out.println(ninjasList);

    }
}
