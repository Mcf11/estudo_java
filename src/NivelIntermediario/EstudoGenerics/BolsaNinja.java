package NivelIntermediario.EstudoGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializando List que receberá tipos genéricos de elementos para receber por exemplo Kunais E Shurikens
    // Você pode definir que a lista receberá, por exemplo, Kunais com private List<Kunai> kunais
    private List<T> itens;

    // Construtor para iniciar nova instancia de array, é diferente do array que é construido automaticamente
    // Esse é sem argumento
    public BolsaNinja() {
        this.itens = new ArrayList<>();
    }

    // Metodo para adicionar itens a bolsa que será do tipo genérico, podendo ser de tipos diferentes
    public void adicionarFerramentas(T item){
        // Referencia a lista de itens declarada acima e adiciona um item com o metodo add
        itens.add(item);
    }

    public void mostrarBolsa(){
        // Se liga nesse for, pra cada item em itens -> absurdo
        for (T item : itens){
            System.out.println(item);
        }
    }
}
