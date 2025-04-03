package NivelIntermediario.LinkedListArrayList;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    /*
    Array: tínhamos de alocar previamente memória e se precisássemos de um elemento além da memoria reservada era necessario voltar no inicio do codigo
    alocar mais memoria e então adicionar um novo elemento
    ArrayList: veio pra solucionar esse gargalo de reservar memoria, alocando dinamicamente a medida que fosse necessario, podendo trabalhar com index
    facilitando a pesquisa de elementos do arraylist, tambem podendo receber o tipo generico como elemento do array porem com o gargalo de toda vez
    que um elemento novo é inserido no meio do arraylist, os outros elementos sao movidos e atribuidos novos valores de memorias, sendo um algoritmo anti-performatico
    em casa de grande volume de dados
    LinkedList: a solução para trabalhar com grande volumes de dados, perdendo na pesquisa de elementos de array porem simplificando a ideia de remoção ou adição de elementos
    */

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");             // Cada elemento é um nó
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");
        System.out.println(linkedList);
        linkedList.add(1, "Kakashi Hatake");
        System.out.println(linkedList);
        linkedList.remove("Sasuke Uchiha");
        System.out.println(linkedList);

        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();


    }


}
