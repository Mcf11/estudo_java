package NivelIntermediario.EstudoRecords;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Narutao", 22, 914151617);
        System.out.println("Cadastro" + cadastro.toString());
        System.out.println("-------------------------");
        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke Uchiha", 23, 9999999);
        System.out.println("Cadastro" + cadastroRecord.toString());                                      // Melhor ainda pq o to string ja veio daora
        System.out.println(cadastroRecord.nomeCaixaAlta());



    }
}
