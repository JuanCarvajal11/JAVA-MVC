package Controlador;
import Modelo.Televisores;
import java.util.ArrayList;

public class ControladorTelevisores {
    int id = 1;
    ArrayList<Televisores> listaTelevisores = new ArrayList<>();
    
    public void registrarTelevisor(Televisores nuevoTelevisor) {
        this.listaTelevisores.add(nuevoTelevisor);
    }

    public ArrayList<Televisores> obtenerTelevisor(){
        return this.listaTelevisores;
    }

    public void actualizarTelevisor(int id, Televisores televisorActualizado){
        for (int i = 0; i < listaTelevisores.size(); i++) {
            if (listaTelevisores.get(i).getId() == id){
                this.listaTelevisores.set(id-1, televisorActualizado);
            }            
        }
    }

    public Televisores buscarTelevisor(int id){
        for (int i = 0; i < listaTelevisores.size(); i++) {
            if (listaTelevisores.get(i).getId() == id){
                return this.listaTelevisores.get(i);
            }            
        }
        return null;
    }

    public int contador(){
        return id ++;
    }

    public void eliminarTelevisor(int id){
        listaTelevisores.remove(id-1);
    }


}
