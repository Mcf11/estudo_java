package NivelIntermediario.EstudoMemoria;

public class Uzumaki extends Ninja{
    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki() {
    }

    public void habilidade(){
        System.out.println(nome + " ativou o poder do protagonismo");
    }
}
