package NivelIntermediario.BancoKonoha;

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo, String tipo) {
        super(titular, saldo, tipo);
    }

    public ContaPoupanca() {
    }

    public void criarContaPoupanca(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do titular");
        String nomeTitular = scanner.nextLine();
        saldo = 1000;
        tipo = "poupanca";
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
        double valor = scanner.nextInt();
        double taxa = valor * 0.01;
        double valorLiquido = valor - taxa;
        saldo += valorLiquido;
        System.out.println("Depósito realizado de " + valorLiquido + " RYO, taxa de " + taxa);
        scanner.close();
    }
}
