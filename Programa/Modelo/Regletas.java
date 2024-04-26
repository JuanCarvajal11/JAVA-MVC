package Modelo;

public class Regletas {
    private int id; 
    private int cant_entradas;
    private int cant_voltaje;
    private String marca;

    public Regletas() {
    }

    public Regletas(int id, int cant_entradas, int cant_voltaje, String marca) {
        this.id = id;
        this.cant_entradas = cant_entradas;
        this.cant_voltaje = cant_voltaje;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCant_entradas() {
        return cant_entradas;
    }

    public void setCant_entradas(int cant_entradas) {
        this.cant_entradas = cant_entradas;
    }

    public int getCant_voltaje() {
        return cant_voltaje;
    }

    public void setCant_voltaje(int cant_voltaje) {
        this.cant_voltaje = cant_voltaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
