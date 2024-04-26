package Modelo;

public class Proyectores {
    private int id;
    private String marca;
    private String resolucion;
    private float largo;
    private float ancho;
    private String color;
    private String tipo_entrada;
    private int cant_entradas;

    public Proyectores() {
    }
    
    public Proyectores(int id, String marca, String resolucion, float largo, float ancho, String color,
            String tipo_entrada, int cant_entradas) {
        this.id = id;
        this.marca = marca;
        this.resolucion = resolucion;
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
        this.tipo_entrada = tipo_entrada;
        this.cant_entradas = cant_entradas;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    public float getLargo() {
        return largo;
    }
    public void setLargo(float largo) {
        this.largo = largo;
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipo_entrada() {
        return tipo_entrada;
    }
    public void setTipo_entrada(String tipo_entrada) {
        this.tipo_entrada = tipo_entrada;
    }
    public int getCant_entradas() {
        return cant_entradas;
    }
    public void setCant_entradas(int cant_entradas) {
        this.cant_entradas = cant_entradas;
    }
    
}
