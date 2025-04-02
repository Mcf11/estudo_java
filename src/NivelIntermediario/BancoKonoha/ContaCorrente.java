package NivelIntermediario.BancoKonoha;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo, String tipo) {
        super(titular, saldo, tipo);
    }

    public ContaCorrente() {
    }

    public void criarContaCorrente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do titular");
        String nomeTitular = scanner.nextLine();
        saldo = 1000;
        tipo = "corrente";
        ContaPoupanca Naruto = new ContaPoupanca(nomeTitular, saldo, tipo);
        System.out.println("Conta criada com sucesso, informações:");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo: " + tipo);
    }

    @Override
    public void depositar() {
        System.out.println("Por favor informe quanto deseja depositar");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        saldo += valor;
        System.out.println("Saldo atualizado com sucesso");
        scanner.close();
    }
}
