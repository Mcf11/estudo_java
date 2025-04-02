package NivelBasico.Scanner;
import java.util.Scanner;

public class ScannerDoUser {
    public static void main(String[] args) {
        // Recebe nome do Ninja
        System.out.println("Digite o nome do ninja: ");
        Scanner caixaDeTexto = new Scanner(System.in);
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Idade do ninja
        System.out.println("Digite a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é " + idadeDoNinja + " anos");
        if (idadeDoNinja >= 18){
            System.out.println("O ninja é maior de idade, pode assumir todo tipo de missão");
        } else {
            System.out.println("O ninja é menor de idade, apenas pode realizar missões de rank B-");
        }
        caixaDeTexto.close();
    }
}
