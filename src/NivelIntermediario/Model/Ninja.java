package NivelIntermediario.Model;

public class Ninja {
    public String nome;
    public int idade;
    public String aldeia;
    public String missao;
    public char rankMissao;
    public String statusMissao;

    public String apresentacao(){
        String frase = "Infos ninja: " + this.nome + ", " + this.idade + ", " + this.aldeia;
        return frase;
    }

    public String infoMissao(){
        String missao = "Missão: " + this.missao + "\nRank: " + rankMissao + "\nStatus: " + statusMissao;
        return missao;
    }

    // Metodo geral que todos os ninjas tem
    public void habilidadeEspecial(){
        System.out.println("Ataque especial de " + this.nome);
    }


}
