package Controlador;
import Modelo.Proyectores;
import java.util.ArrayList;

public class ControladorProyectores {
    int id = 1;
    ArrayList<Proyectores> listaProyectores = new ArrayList<>();
    
    public void registrarProyector(Proyectores nuevoProyector) {
        this.listaProyectores.add(nuevoProyector);
    }

    public ArrayList<Proyectores> obtenerProyector(){
        return this.listaProyectores;
    }

    public void actualizarProyector(int id, Proyectores proyectorActualizado){
        for (int i = 0; i < listaProyectores.size(); i++) {
            if (listaProyectores.get(i).getId() == id){
                this.listaProyectores.set(id-1, proyectorActualizado);
            }            
        }
    }

    public Proyectores buscarProyector(int id){
        for (int i = 0; i < listaProyectores.size(); i++) {
            if (listaProyectores.get(i).getId() == id){
                return this.listaProyectores.get(i);
            }            
        }
        return null;
    }

    public int contador(){
        return id ++;
    }

    public void eliminarProyector(int id){
        listaProyectores.remove(id-1);
    }
}
