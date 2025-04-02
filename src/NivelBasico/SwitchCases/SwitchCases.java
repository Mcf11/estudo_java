package NivelBasico.SwitchCases;

import java.util.Scanner;

public class SwitchCases {
    /*
    Dar opções ao usuário de qual personagem ele quer escolher
    */

    public static void main(String[] args) {
        // Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um personagem");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sasuke Uchiha");
        System.out.println("3. Sakura Haruno");

        int escolha = scanner.nextInt();
        System.out.println("Opção escolhida: " + escolha);

        switch(escolha){
            case 1:
                System.out.println("Naruto Uzumaki escolhido");
                break;
            case 2:
                System.out.println("Sasuke Uchiha escolhido");
                break;
            case 3:
                System.out.println("Sakura Haruno escolhida");
                break;
            default:
                System.out.println("Opção inválida");



        }

        scanner.close();

    }
}
