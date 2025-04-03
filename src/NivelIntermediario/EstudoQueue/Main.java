package NivelIntermediario.EstudoQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // Queue
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // O metodo toString tambem ja existe aqui
        System.out.println(ninjasQueue);
        ninjasQueue.poll();
        System.out.println(ninjasQueue);
        System.out.println("Próximo da fila: " + ninjasQueue.peek());
        ninjasQueue.remove("Shikamaru");
        System.out.println(ninjasQueue);
        ninjasQueue.clear();
        System.out.println(ninjasQueue);
        if (ninjasQueue.isEmpty()){
            System.out.println("Fila vazia");
        }
    }

}
