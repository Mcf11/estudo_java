package NivelIntermediario.EstudoHash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Naruto");
        ninjas.add("Shikamaru");
        ninjas.add("Podolski");

        Set<String> ninjasSet = new HashSet<>();
        System.out.println(ninjasSet);
        ninjasSet.addAll(ninjas);
        System.out.println(ninjasSet);
    }
}
