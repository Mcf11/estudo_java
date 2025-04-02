package NivelIntermediario.Desafio3;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Konohamaru = new NinjaBasico("Konohamaru Sarutobi", 10, "Rasengan");
        Konohamaru.mostrarInformacoes();
        Konohamaru.executarHabilidade();

        System.out.println("------------------------------------");

        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi Hatake", 32, "Chidori", "CopyNinja");
        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();
    }


}
