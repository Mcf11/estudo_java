package NivelIntermediario.Abstratas;

public abstract class Ninja implements Estrategia{
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

    public void habilidadeEspecial(){
        System.out.println("Meteoro de vai tomar no cu do " + nome);
    }

    public abstract void jogar();

}
