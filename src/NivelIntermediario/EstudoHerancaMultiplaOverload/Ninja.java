package NivelIntermediario.EstudoHerancaMultiplaOverload;

public abstract class Ninja implements EstrategiaDeBatalha{

    // Deixa abstrata pois nao criamos ninjas diretamente e sim referenciamos essa classe parent para outras subclasses
    // Evitando assim criação de um ninja generico fora dos padrões de clãs

    //TODO: Incluir 2 novos atributos -> numeroDeMissoesConcluidas, Rank
    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    Rank rank;


    public Ninja(String nome, int idade, String aldeia) {
        this.idade = idade;
        this.nome = nome;
        this.aldeia = aldeia;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos NumeroDeMissoesConcluidas e Rank
    // Apenas referencia os novos atributos sem redeclarar o construtor anterior

    public Ninja(String nome, int idade, String aldeia, Rank rank, int numeroDeMissoesConcluidas) {
        this(nome, idade, aldeia);                // Apenas referencie aqui
        this.rank = rank;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public Ninja() {
    }

    public void missions(){
        System.out.println(nome + " atualmente com o registro de " + numeroDeMissoesConcluidas + " missões concluídas. Um ninja nível " + rank);
    }

    // Sobrecarga de metodo
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Proteger habitantes do Pain");
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Inteligência base não calculada");
    }

    public void inteligenciaDeCombate(int qi){
        if (qi > 80 && qi < 90){
            System.out.println("QI: " + qi + ", lerdão demais, morra por alguém");
        } else if (qi >= 90 && qi < 110){
            System.out.println("QI: " + qi + ", ninja padrão");
        } else if (qi >= 110 && qi < 120){
            System.out.println("QI: " + qi + ", ninja qualificado");
        } else if (qi >= 120 && qi < 140){
            System.out.println("QI: " + qi + ", ninja especialista");
        } else if (qi >= 140){
            System.out.println("QI: " + qi + ", gênio do jutsu");
        } else {
            System.out.println("O ninja é uma ameba");
        }
    }
}
