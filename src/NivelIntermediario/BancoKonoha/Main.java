package NivelIntermediario.BancoKonoha;

import java.util.Scanner;

public class Main {
    //TODO: voltar um dia e corrigir essa porcaria

    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco de Konoha!");
        System.out.println("Escolha uma das opções");
        System.out.println("1. Criar conta");
        System.out.println("2. Depositar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        ContaCorrente Sasuke = new ContaCorrente("Sasuke Uchiha", 1000, "corrente");

        ContaPoupanca Naruto = new ContaPoupanca("Naruto Uzumaki", 1000, "poupanca");


        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    System.out.println("Qual tipo de conta?");
                    System.out.println("1. Poupança");
                    System.out.println("2. Corrente");
                    int tipoConta = scanner.nextInt();
                    if (tipoConta == 1) {
                        Naruto.criarContaPoupanca();
                    } else if (tipoConta == 2) {
                        Sasuke.criarContaCorrente();
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 2:
                    System.out.println("Escolha a conta para depósito:");
                    System.out.println("1. Poupança");
                    System.out.println("2. Corrente");
                    int contaEscolhida = scanner.nextInt();
                    if (contaEscolhida == 1) {
                        Naruto.depositar();
                        break;
                    } else if (contaEscolhida == 2) {
                        Sasuke.depositar();
                        break;
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 3:
                    System.out.println("Escolha a conta para consultar saldo:");
                    System.out.println("1. Poupança");
                    System.out.println("2. Corrente");
                    int contaConsulta = scanner.nextInt();
                    if (contaConsulta == 1) {
                        Naruto.consultarSaldo();
                    } else if (contaConsulta == 2) {
                        Sasuke.consultarSaldo();
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("\nEscolha uma das opções novamente:");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            escolha = scanner.nextInt();
        }

        scanner.close();
        System.out.println("Obrigado por usar o Banco de Konoha!");
    }

}
