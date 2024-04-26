package Modelo;

public class Televisores {
    private int id;
    private String marca;
    private String resolucion;
    private String cant_puertos;
    private String os;

    public Televisores() {
    }

    public Televisores(int id, String marca, String resolucion, String cant_puertos, String os) {
        this.id = id;
        this.marca = marca;
        this.resolucion = resolucion;
        this.cant_puertos = cant_puertos;
        this.os = os;
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

    public String getCant_puertos() {
        return cant_puertos;
    }

    public void setCant_puertos(String cant_puertos) {
        this.cant_puertos = cant_puertos;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}
