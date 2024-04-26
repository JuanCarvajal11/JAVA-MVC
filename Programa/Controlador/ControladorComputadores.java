package Controlador;
import Modelo.Computadores;
import java.util.ArrayList;

public class ControladorComputadores {
    int id = 1;
    ArrayList<Computadores> listaComputadores = new ArrayList<>();//Crear una lista 
    
    public void registrarComputador(Computadores nuevoComputador) {//Aqui indicamos que lo que hay en la lista van a ser los valores del nuevo computador
        this.listaComputadores.add(nuevoComputador);
    }

    public ArrayList<Computadores> obtenerComputador(){//Llama a todos los valores de la lista y los muestra
        return this.listaComputadores;
    }

    public void actualizarComputador(int id, Computadores computadorActualizado){//Actualizar la informacion del computador
        for (int i = 0; i < listaComputadores.size(); i++) {
            if (listaComputadores.get(i).getId() == id){
                this.listaComputadores.set(id-1, computadorActualizado);
            }            
        }
    }

    public Computadores buscarComputador(int id){ //Por medio de la id busca alguna de las listas que tenga esa id que se busca y la muestra
        for (int i = 0; i < listaComputadores.size(); i++) {
            if (listaComputadores.get(i).getId() == id){
                return this.listaComputadores.get(i);
            }            
        }
        return null;
    }

    public int contador(){//Suma las id
        return id ++;
    }

    public void eliminarComputador(int id){//Elimina la lista dependiendo de la id
        listaComputadores.remove(id-1);
    }
    
}
