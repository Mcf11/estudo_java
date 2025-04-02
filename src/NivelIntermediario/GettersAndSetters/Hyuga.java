package NivelIntermediario.GettersAndSetters;

public class Hyuga extends Ninja{

    public Hyuga() {
    }

    public Hyuga(String nome, int idade, String aldeia, int numeroMissoes, double rate) {
        super(nome, idade, aldeia, numeroMissoes, rate);
    }

    public void Byakugan(){
        System.out.println("Byakugan! -" + getNome());
    }

}
