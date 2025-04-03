package NivelIntermediario.EstudoRecords;

public record NinjaRecord(String nome, int idade, int telefone) {

    public String nomeCaixaAlta(){
        return nome.toUpperCase();
    }

}
