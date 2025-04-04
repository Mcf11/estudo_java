package NivelAvancado.EstudoStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();

        ninjas.add(new Ninja("Naruto Uzumaki", 16, "Konoha"));
        ninjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi", 30, "Konoha"));
        ninjas.add(new Ninja("Rock Lee", 16, "Konoha"));
        ninjas.add(new Ninja("Sabaku no Gaara", 18, "Suna"));
        ninjas.add(new Ninja("Kimimaro", 28, "Som"));
        ninjas.add(new Ninja("Pain", 55, "Chuva"));

        /*
        Metodo antigo ugabuga
        for (int i = 0; i < ninjas.size(); i++) {
            System.out.println(ninjas.get(i));
        }*/
/*

        System.out.println(ninjas.stream().sorted());
        ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Konoha"))
                .forEach(System.out::println);
*/
        System.out.println("---------- Ordenado alfabético ----------");

        // Ordenacao
        ninjas.stream()
                .sorted((n1, n2) -> CharSequence.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);

        System.out.println("------------------------------");

        // MAP
        ninjas.stream()
                .map(Ninja::toString)
                .forEach(System.out::println);

        System.out.println("------------------------------");

        ninjas.stream()
                .map(Ninja::getIdade)
                .forEach(System.out::println);

        System.out.println("---------- Ordenado por ninja mais velho ----------");

        Ninja ninjaVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println("Ninja mais velho: "  + ninjaVelho);

        // Obrigado Fiasco
    }
}
