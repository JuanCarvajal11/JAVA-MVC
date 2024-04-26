package Controlador;
import Modelo.Regletas;
import java.util.ArrayList;

public class ControladorRegletas {
    int id = 1;
    ArrayList<Regletas> listaRegletas = new ArrayList<>();
    
    public void registrarRegleta(Regletas nuevaRegleta) {
        this.listaRegletas.add(nuevaRegleta);
    }

    public ArrayList<Regletas> obtenerRegleta(){
        return this.listaRegletas;
    }

    public void actualizarRegleta(int id, Regletas regletaActualizada){
        for (int i = 0; i < listaRegletas.size(); i++) {
            if (listaRegletas.get(i).getId() == id){
                this.listaRegletas.set(id-1, regletaActualizada);
            }            
        }
    }

    public Regletas buscarRegleta(int id){
        for (int i = 0; i < listaRegletas.size(); i++) {
            if (listaRegletas.get(i).getId() == id){
                return this.listaRegletas.get(i);
            }            
        }
        return null;
    }

    public int contador(){
        return id ++;
    }

    public void eliminarRegleta(int id){
        listaRegletas.remove(id-1);
    }
}
