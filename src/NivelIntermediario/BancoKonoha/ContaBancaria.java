package NivelIntermediario.BancoKonoha;

import java.util.Scanner;

public abstract class ContaBancaria implements Conta{
    String titular;
    double saldo;
    String tipo;

    public ContaBancaria(String titular, double saldo, String tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public ContaBancaria() {
    }


    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }



}
