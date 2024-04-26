package Modelo;

public class Memorias {
    private int id;
    private String tipo_memoria;
    private String almacenamiento;
    private String marca;
    private String color;

    public Memorias() {
    }
    
    public Memorias(int id, String tipo_memoria, String almacenamiento, String marca, String color) {
        this.id = id;
        this.tipo_memoria = tipo_memoria;
        this.almacenamiento = almacenamiento;
        this.marca = marca;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_memoria() {
        return tipo_memoria;
    }

    public void setTipo_memoria(String tipo_memoria) {
        this.tipo_memoria = tipo_memoria;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

