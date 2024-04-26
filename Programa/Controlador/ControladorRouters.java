package Controlador;
import Modelo.Routers;
import java.util.ArrayList;

public class ControladorRouters {
    int id = 1;
    ArrayList<Routers> listaRouters = new ArrayList<>();
    
    public void registrarRouter(Routers nuevoRouters) {
        this.listaRouters.add(nuevoRouters);
    }

    public ArrayList<Routers> obtenerRouter(){
        return this.listaRouters;
    }

    public void actualizarRouter(int id, Routers routerActualizado){
        for (int i = 0; i < listaRouters.size(); i++) {
            if (listaRouters.get(i).getId() == id){
                this.listaRouters.set(id-1, routerActualizado);
            }            
        }
    }

    public Routers buscarRouter(int id){
        for (int i = 0; i < listaRouters.size(); i++) {
            if (listaRouters.get(i).getId() == id){
                return this.listaRouters.get(i);
            }            
        }
        return null;
    }

    public int contador(){
        return id ++;
    }

    public void eliminarRouter(int id){
        listaRouters.remove(id-1);
    }
}
