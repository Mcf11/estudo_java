package NivelIntermediario.EstudoConstrutores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuMorto;

    // Construtor vazio, um novo objeto não terá os valores definidos, caso precise
    public Hokages(){
    }


    // Alt + Insert -> Constructor -> Seleciona argumentos, para criar um objeto já com atributos definidos
    public Hokages(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }


}
