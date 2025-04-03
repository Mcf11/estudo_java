package NivelIntermediario.EstudoStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        // São estáticos e tem referencia de memoria previamente declarada
        String[] ninjasArray = new String[3];
        ninjasArray[1] = "Naruto Uzumaki";

        // Array List
        // Listas sao dinamicas, tamanhho flexível aumentando e diminuindo conforme necessidade
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro elemento a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno"); // Primeiro elemento da lista
        System.out.println("Stack atual: " + ninjaStack);
        System.out.println("Removendo item da stack com pop...");
        ninjaStack.pop();
        System.out.println("Item removido!");
        System.out.println("Stack pós pop: " + ninjaStack);
        System.out.println("Tamanho da Stack: " + ninjaStack.size());
        System.out.println("Adicionando novo ninja na lista..");
        ninjaStack.push("Uchiha Madara");
        System.out.println("Ninja adicionado!");
        System.out.println(ninjaStack.peek());
        System.out.println("Stack pós adição: " + ninjaStack);

    }
}
