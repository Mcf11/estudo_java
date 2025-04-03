package NivelIntermediario.EstudoGenerics;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        System.out.println("------------ Bolsa 1 ------------");

        // Criação da bolsa que receberá EquipamentosNinja como elementos, chamará minhaBolsa e será uma instancia da classe Bolsa
        Bolsa<EquipamentosNinja> minhaBolsa = new Bolsa<>();

        // Colocando equipamentos a partir da criação genérica
        minhaBolsa.adicionarEquipamentos(kunai);
        minhaBolsa.adicionarEquipamentos(shuriken);
        minhaBolsa.adicionarEquipamentos(pergaminho);

        System.out.println(minhaBolsa.toString());

        System.out.println("------------ Bolsa 2 ------------");
        // O object aqui vem de uma super classe
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramentas(new Shuriken(20));
        bolsaNinja.adicionarFerramentas(new Pergaminho("sapo boi azul"));
        bolsaNinja.adicionarFerramentas(new Kunai("com selo explosivo"));
        bolsaNinja.mostrarBolsa();

        // Dessa forma a bolsa recebe diferentes tipos de objeto

    }
}
