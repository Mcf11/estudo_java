package NivelIntermediario.EstudoMemoria;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public Ninja() {
    }

    public void infosNinja(){
        System.out.println("Infos ninja: "+ nome + ", " + idade + ", " + aldeia);
    }

    @Override
    public String toString() {
        return "Infos ninja: "+ nome + ", " + idade + ", " + aldeia;
    }
}
