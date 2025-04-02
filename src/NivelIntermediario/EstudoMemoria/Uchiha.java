package NivelIntermediario.EstudoMemoria;

public class Uchiha extends Ninja{
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha() {
    }

    public void SharinganAtivado(){
        System.out.println(nome + " ativou o Mangekyo Sharingan");
    }
}
