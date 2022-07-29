package modelo;

/**
 *
 * @author Lisandro
 */

public class VistaTicketModelo {

    private int id;
    private String nombre_apellido;
    private String Categoría;
    private int Cantidad;
    private float Precio;
    private double Total;
    private String Fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getCategoría() {
        return Categoría;
    }

    public void setCategoría(String Categoría) {
        this.Categoría = Categoría;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public VistaTicketModelo(int id, String nombre_apellido, String Categoría, int Cantidad, float Precio, double Total) {
        this.id = id;
        this.nombre_apellido = nombre_apellido;
        this.Categoría = Categoría;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Total = Total;
    }
    
    

}
