package modelo;

/**
 *
 * @author Lisandro
 * @param <Tipo>
 */
public interface DAO<Tipo>{
    public boolean crear(Tipo tipo);
    public boolean modificar(Tipo actual, Tipo nuevo);;
    public boolean borrar(Tipo tipo);
}
