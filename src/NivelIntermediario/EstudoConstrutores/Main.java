package NivelIntermediario.EstudoConstrutores;

public class Main {
    public static void main(String[] args) {
        Hokages Minato = new Hokages("Minato Namikaze", 30, false);
        System.out.println("Nome: " + Minato.nome + ", idade: " + Minato.idade + ", vivo: " + Minato.vivoOuMorto);


        Hokages Tobirama = new Hokages("Tobirama Senju", 44, false);
        System.out.println("Nome: " + Tobirama.nome + ", idade: " + Tobirama.idade + ", vivo: " + Tobirama.vivoOuMorto);

    }
}
