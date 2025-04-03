package NivelIntermediario.EstudoGenerics;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> equipamentos;

    public Bolsa(){
        this.equipamentos = new ArrayList<>();
    }

    // Metodo para equipamentos genericos
    public void adicionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    @Override
    public String toString(){
        return "Bolsa de equpamentos: " + equipamentos.toString();
    }

    public Bolsa(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

}
