package modelo;

/**
 *
 * @author Lisandro
 */
public class Ticket {

    private int id_ticket;
    private int id_persona;
    private int id_categoria;
    private int cantidad;
    private float precio_unitario;
    private float precio_total;
    private String fecha;
    private boolean estado;

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Ticket(int id_ticket, int id_persona, int id_categoria, int cantidad, float precio_unitario, float precio_total, String fecha, boolean estado) {
        this.id_ticket = id_ticket;
        this.id_persona = id_persona;
        this.id_categoria = id_categoria;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.precio_total = precio_total;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Ticket(int id_persona, int id_categoria, int cantidad, float precio_unitario) {
        this.id_persona = id_persona;
        this.id_categoria = id_categoria;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public Ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Ticket() {
    }

}
