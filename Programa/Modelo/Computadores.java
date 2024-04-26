package Modelo;

public class Computadores {
    //Definimos los atributos
    private int id;
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String tipo_almacenamiento;
    private String procesador;
    private String cargador;
    private String mouse;

    //Constructor vacio
    public Computadores() {
    }

    //Constructor lleno
    public Computadores(int id, String marca, String modelo, String almacenamiento, String tipo_almacenamiento,
            String procesador, String cargador, String mouse) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.tipo_almacenamiento = tipo_almacenamiento;
        this.procesador = procesador;
        this.cargador = cargador;
        this.mouse = mouse;
    }

    //Get para llamar los datos
    public int getId() {
        return id;
    }

    //Set para agregarlos
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

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipo_almacenamiento() {
        return tipo_almacenamiento;
    }

    public void setTipo_almacenamiento(String tipo_almacenamiento) {
        this.tipo_almacenamiento = tipo_almacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getCargador() {
        return cargador;
    }

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}
