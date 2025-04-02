package NivelIntermediario.Model;

public class Uchiha extends Ninja {
    public void SharinganAtivado(){
        System.out.println(this.nome + " ativou o Mangekyo Sharingan!");
    }

    // Sobrescrevendo metodo
    public String apresentacao(){
        String frase = "Infos ninja: " + this.nome + ", " + this.idade + ", " + this.aldeia + ", afinidade com elemento fogo por ser um Uchiha";
        return frase;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Chidori de " + this.nome);
    }
}
