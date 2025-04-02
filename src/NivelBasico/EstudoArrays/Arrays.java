package NivelBasico.EstudoArrays;

public class Arrays {
    /*
    Estudando criação de listas e manipulação de elementos

    Evitando declaração ugabuga
    Ninja1 = "Minha pica"
    sout(Ninja1)
    */

    public static void main(String[] args) {
        String[] ninja = new String [4];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";

        int[] idade = new int [2];
        idade[0] = 10;

        System.out.println(ninja[0]);
        System.out.println(idade[1]);

        // Redeclarando array
        System.out.println(ninja);               // um endereço de memória sendo referenciado
        ninja = new String[2];
        ninja[0] = "Kyuubi";
        ninja[1] = "Hachbi";
        System.out.println(ninja);              // outro endereço de memória sendo referenciado, o anterior está momentaneamente fora de alcance

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }

    }
}
