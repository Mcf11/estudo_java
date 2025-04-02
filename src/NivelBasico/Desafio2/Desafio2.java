package NivelBasico.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAX_NINJAS = 10;
        String[] ninjas = new String[MAX_NINJAS];

        int ninjasCadastrados = 0;
        int opcaoMenu = 0;

        System.out.println("\n====Menu Ninja====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Deletar Ninja");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção:");

        opcaoMenu = scanner.nextInt();
        scanner.nextLine();             // Limpar o buffer

        while (opcaoMenu != 4){
            switch(opcaoMenu){
                case 1:
                    if (ninjasCadastrados < MAX_NINJAS){
                        System.out.println("Digite o nome do ninja");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;            // Index vai aumentar conforme rodar a rotina
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("Lista cheia");
                    }
                    break;

                case 2:
                    if(ninjasCadastrados == 0){
                        System.out.println("Lista vazia");
                    } else {
                        System.out.println("Lista de ninjas:");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Selecione o ninja a ser removido");
                    System.out.println("Lista de ninjas:");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("Ninja " + i +": " + ninjas[i]);
                    int removeNinja = scanner.nextInt();
                    for (int j = removeNinja; j < ninjas.length - 1; j++){
                        ninjas[j] = ninjas[j + 1];
                    }
                    ninjas[ninjas.length - 1] = String.valueOf(0);

                    }
            }
        }

    }
}
