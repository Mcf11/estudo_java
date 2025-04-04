package NivelIntermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /*
    Iniciar uma linkedlist com 7 ninjas
    Adicionar o ninja no inicio da list
    Remover o ninja no inicio da list
    Listar os ninjas
    Procurar um ninja por indice
    */
    public static void main(String[] args) {
        Ninja Naruto = new Ninja("Naruto Uzumaki", 16, "Konoha");
        Ninja Sasuke = new Ninja("Sasuke Uchiha", 17, "Akatsuki");
        Ninja Sakura = new Ninja("Sakura Haruno", 17, "Konoha");
        Ninja Lee = new Ninja("Rock Lee", 17, "Konoha");
        Ninja Gai = new Ninja("Gai Sensei", 33, "Konoha");
        Ninja Kakashi = new Ninja("Kakashi Hatake", 33, "Konoha");
        Ninja Shikamaru = new Ninja("Shikamaru Nara", 18, "Konoha");

        LinkedList<Ninja> ninjasList = new LinkedList<>();
        ninjasList.add(Naruto);
        ninjasList.add(Sasuke);
        ninjasList.add(Sakura);
        ninjasList.add(Lee);
        ninjasList.add(Gai);
        ninjasList.add(Kakashi);
        ninjasList.add(Shikamaru);

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Bem vindo ao cadastro ninja!");
        System.out.println("Por favor escolha uma opção:");
        System.out.println("1. Adicionar ninja");
        System.out.println("2. Remover ninja");
        System.out.println("3. Listar ninjas cadastrados");
        System.out.println("4. Sair");

        int escolhaMenu = scanner.nextInt();
        scanner.nextLine();

        while (escolhaMenu != 4) {
            switch (escolhaMenu) {
                case 1:
                    System.out.println("Informe o nome do ninja a ser adicionado:");
                    String nomeNinja = scanner.nextLine();
                    System.out.println("Informe a idade do ninja:");
                    int idadeNinja = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe a aldeia do ninja:");
                    String aldeiaNinja = scanner.nextLine();
                    Ninja novoNinja = new Ninja(nomeNinja, idadeNinja, aldeiaNinja);
                    ninjasList.addFirst(novoNinja);
                    System.out.println("Ninja " + nomeNinja + " adicionado com sucesso!");
                    break;

                case 2:
                    Ninja primeiroNinja = ninjasList.peek();
                    System.out.println("Remover ninja " + primeiroNinja + "?");
                    System.out.println("SIM/NAO");
                    String confirmacao = scanner.nextLine();
                    if (confirmacao.equalsIgnoreCase("SIM")) {
                        ninjasList.pop();
                        System.out.println("Ninja " + primeiroNinja + " removido com sucesso!");
                    } else if (confirmacao.equalsIgnoreCase("NAO")) {
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de ninjas cadastrados:");
                    for (Ninja ninja : ninjasList) {
                        System.out.println(ninja);
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("------------------------");
            System.out.println("Por favor escolha uma opção:");
            System.out.println("1. Adicionar ninja");
            System.out.println("2. Remover ninja");
            System.out.println("3. Listar ninjas cadastrados");
            System.out.println("4. Sair");

            escolhaMenu = scanner.nextInt();
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Obrigado por usar nosso sistema de cadastro!");
    }
}
