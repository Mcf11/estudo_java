package NivelIntermediario.Logica;
import NivelIntermediario.Model.*;

public class Main {
    public static void main(String[] args) {
        // TEM ADICIONAL DO MENU SE QUISER TREINAR

        System.out.println("-------- Lista de ninjas cadastrados --------");
        // Criando um objeto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Konoha";
        Sasuke.missao = "treinar com Orochimaru";
        Sasuke.rankMissao = 'S';
        Sasuke.statusMissao = "em curso";
        System.out.println(Sasuke.apresentacao());
        Sasuke.SharinganAtivado();
        Sasuke.habilidadeEspecial();
        System.out.println(Sasuke.infoMissao());

        System.out.println("----------------------------------------------");

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Konoha";
        Naruto.missao = "buscar o Sasuke na porrada";
        Naruto.rankMissao = 'S';
        Naruto.statusMissao = "em curso";

        System.out.println(Naruto.apresentacao());
        Naruto.SanninAtivado();
        Naruto.habilidadeEspecial();
        System.out.println(Naruto.infoMissao());

        System.out.println("----------------------------------------------");

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
        Sakura.aldeia = "Konoha";
        Sakura.missao = "chorar pelo Sasuke e pedir pro Naruto voltar";
        Sakura.rankMissao = 'C';
        Sakura.statusMissao = "em curso";

        System.out.println(Sakura.apresentacao());
        Sakura.CuraAtivada();
        System.out.println(Sakura.infoMissao());

        System.out.println("----------------------------------------------");

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 17;
        Hinata.aldeia = "Konoha";
        Hinata.missao = "treinar com Neji Hyuga";
        Hinata.rankMissao = 'A';
        Hinata.statusMissao = "concluída";
        System.out.println(Hinata.apresentacao());
        Hinata.ByakuganAtivado();
        System.out.println(Hinata.infoMissao());

        System.out.println("----------------------------------------------");

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 11;
        Boruto.aldeia = "Konoha";
        Boruto.missao = "proteger a vila";
        Boruto.rankMissao = 'A';
        Boruto.statusMissao = "em curso";
        System.out.println(Boruto.apresentacao());
        Boruto.SanninAtivado();
        Boruto.AtivarJougan();
        System.out.println(Boruto.infoMissao());
    }
}
