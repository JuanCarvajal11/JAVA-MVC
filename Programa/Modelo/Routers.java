package Modelo;

public class Routers {
    private int id;
    private String marca;
    private String modelo;
    private String velocidad;
    private String tipo_conecti;
    private String cant_voltaje;

    public Routers() {
    }

    public Routers(int id, String marca, String modelo, String velocidad, String tipo_conecti, String cant_voltaje) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.tipo_conecti = tipo_conecti;
        this.cant_voltaje = cant_voltaje;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo_conecti() {
        return tipo_conecti;
    }

    public void setTipo_conecti(String tipo_conecti) {
        this.tipo_conecti = tipo_conecti;
    }

    public String getCant_voltaje() {
        return cant_voltaje;
    }

    public void setCant_voltaje(String cant_voltaje) {
        this.cant_voltaje = cant_voltaje;
    }

}
