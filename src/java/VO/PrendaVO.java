package VO;

public class PrendaVO {
    
    private Integer prendaId;
    private String  nombre;
    private String  genero;
    private String  calidad;
    private String  marca;
    private Double  precio;
    
    public PrendaVO(){
    
    }

    public PrendaVO(Integer prendaId, String nombre, String genero, String calidad, String marca, Double precio) {
        this.prendaId = prendaId;
        this.nombre = nombre;
        this.genero = genero;
        this.calidad = calidad;
        this.marca = marca;
        this.precio = precio;
    }

    public Integer getPrendaId() {
        return prendaId;
    }

    public void setPrendaId(Integer prendaId) {
        this.prendaId = prendaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
       
}
