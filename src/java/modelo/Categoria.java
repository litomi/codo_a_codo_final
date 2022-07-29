package modelo;

/**
 *
 * @author Lisandro
 */
public class Categoria {

    private int id_categoria;
    private String nombre;
    private String descuento;
    private String descripcion;

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria(int id_categoria, String nombre, String descuento, String descripcion) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.descuento = descuento;
        this.descripcion = descripcion;
    }

    
    
    
}
