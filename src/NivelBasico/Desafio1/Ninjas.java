package NivelBasico.Desafio1;

public class Ninjas {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 17;
        String missaoNinja1 = "treinar com o Jiraya Sannin";
        String dificuldade = "SS";
        String status = "em curso";
        if (idadeNinja1 < 15){
            if (dificuldade == "C" || dificuldade == "D"){
                status = "concluído";
            }
        } else {
            status = "concluído";
        }

        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 16;
        String missaoNinja2 = "treinar com o Kakashi Sensei";
        String dificuldade2 = "SS";
        String status2 = "em curso";
        if (idadeNinja2 < 15){
            if (dificuldade2 == "C" || dificuldade2 == "D"){
                status2 = "concluído";
            }
        } else {
            status2 = "concluído";
        }

        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 16;
        String missaoNinja3 = "treinar com a Tsunade Senju";
        String dificuldade3 = "SS";
        String status3 = "em curso";
        if (idadeNinja3 < 15){
            if (dificuldade3 == "C" || dificuldade3 == "D"){
                status3 = "concluído";
            }
        } else {
            status3 = "concluído";
        }


        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Ninja " + nomeNinja1 + ", está em missão " + missaoNinja1 + ", status da missão: " + status);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Ninja " + nomeNinja2 + ", está em missão " + missaoNinja2 + ", status da missão: " + status2);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Ninja " + nomeNinja3 + ", está em missão " + missaoNinja3 + ", status da missão: " + status3);
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
