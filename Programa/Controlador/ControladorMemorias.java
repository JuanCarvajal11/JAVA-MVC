package Controlador;

import Modelo.Memorias;
import java.util.ArrayList;

public class ControladorMemorias {
    int id = 1;
    ArrayList<Memorias> listaMemorias = new ArrayList<>();

    public void registrarMemoria(Memorias nuevaMemoria) {
        this.listaMemorias.add(nuevaMemoria);
    }

    public ArrayList<Memorias> obtenerMemoria() {
        return this.listaMemorias;
    }

    public void actualizarMemoria(int id, Memorias memoriaActualizada) {
        for (int i = 0; i < listaMemorias.size(); i++) {
            if (listaMemorias.get(i).getId() == id) {
                this.listaMemorias.set(id - 1, memoriaActualizada);
            }
        }
    }

    public Memorias buscarMemoria(int id) {
        for (int i = 0; i < listaMemorias.size(); i++) {
            if (listaMemorias.get(i).getId() == id) {
                return this.listaMemorias.get(i);
            }
        }
        return null;
    }

    public int contador() {
        return id++;
    }

    public void eliminarMemoria(int id) {
        listaMemorias.remove(id - 1);
        id--;
        
    }
}
