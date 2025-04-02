package NivelIntermediario.Model;

public class Uzumaki extends Ninja {
    public void SanninAtivado(){
        System.out.println(this.nome + " ativou o modo sábio");
    }
    @Override
    public void habilidadeEspecial() {
        System.out.println("Rasengan de " + this.nome);
    }

}
